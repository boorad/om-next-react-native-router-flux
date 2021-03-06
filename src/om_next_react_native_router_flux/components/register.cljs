(ns om-next-react-native-router-flux.components.register
  (:require-macros [natal-shell.components :refer [view text image touchable-highlight]]
                   [natal-shell.alert :refer [alert]])
  (:require
    [om-next-react-native-router-flux.react-requires :refer [Actions Navigator ReactNativeModalbox TabBar]]
    [om-next-react-native-router-flux.react-helpers :refer [button]]
    [om.next :as om :refer-macros [defui]]))

(def styles {:container {:flex            1
                         :justifyContent  "center"
                         :alignItems      "center"
                         :backgroundColor "#F5FCFF"}})

(defui Register
       Object
       (render [this]
               (view {:style (:container styles)}
                     (text {} "Register page")
                     (button {:onPress #(.home Actions)} "Replace screen")
                     (button {:onPress #(.pop Actions)} "Back"))))
