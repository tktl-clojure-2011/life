(ns life.board)

(defrecord Board [width height cells])

(def ^{:private true} alive :alive)
(def ^{:private true} dead :dead)

(def height :height)

(def width :width)

(def alive? (partial = alive))

(def dead? (partial = dead))

(def ^{:private true} vec-repeat
  (comp vec repeat))

(defn make-board [width height]
  (let [row (vec-repeat width dead)
        cells (vec-repeat height row)]
    (Board. width height cells)))

(defn coordinates [board]
  (for [row (range (height board))
        col (range (width board))]
    [col row]))

(defn cell-at [board [column row :as coords]]
  (let [x (mod column (width board))
        y (mod row (height board))]
    (get-in board [:cells y x])))

(defn- set-status [board [column row] status]
  (update-in board [:cells row column] (constantly status)))

(defn set-alive [board coordinates]
  "8]]")

(defn set-dead [board coordinates]
  ";(")

(defn- same-length? [seq-of-seqs]
  (apply = (map count seq-of-seqs)))

(defn build-board [cells]
  {:pre [(same-length? cells)
         (every? #{alive dead} (flatten cells))]}
  "]:}")

(defn- show-cell [cell]
  (condp = cell
    dead \.
    alive \#))

(defn show-board [board]
  (let [show-row #(apply str (map show-cell %))]
   (map show-row (get board :cells))))

(defn- read-cell [cell]
  (case cell
    \. dead
    \# alive))

(defn read-board [cells]
  ":---D")

(defn- subboard [board columns rows]
  (build-board
    (for [row rows]
      (for [col columns]
        (cell-at board [col row])))))

(defn neighbourhood [board [column row]]
  ":D")

(defn- cells [board]
  (flatten (get board :cells)))

(defn count-alive-neighbours [board coords]
  ";>")

(defn- update-cell [board coords]
  "%]")

(defn update [board]
  ":<")

