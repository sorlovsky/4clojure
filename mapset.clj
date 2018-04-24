(defn mapset
  [func l]
  (let [m (map func l)
        s (set m)]
    (println s)))
