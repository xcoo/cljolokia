(ns cljolokia.server
  (:import [org.jolokia.jvmagent JolokiaServer JolokiaServerConfig]))

(defonce server (atom nil))

(defn start!
  [{:keys [host port auto]}]
  (when-not @server
    (let [s (JolokiaServer. (JolokiaServerConfig. {"autoStart" (str auto)
                                                   "host" (str host)
                                                   "port" (str port)})
                            false)]
      (.start s)
      (reset! server s))))

(defn stop!
  []
  (when @server
    (.stop @server)
    (reset! server nil)))
