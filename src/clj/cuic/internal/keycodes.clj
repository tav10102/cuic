(ns cuic.internal.keycodes)

(set! *warn-on-reflection* true)

(def keycode-mapping
  {"BracketLeft"        {:keyCode 219, :key "[", :code "BracketLeft"},
   "BracketRight"       {:keyCode 221, :key "}", :code "BracketRight"},
   "KeyY"               {:keyCode 89, :key "y", :code "KeyY"},
   "KeyL"               {:keyCode 76, :key "l", :code "KeyL"},
   "Digit2"             {:keyCode 50, :key "@", :code "Digit2"},
   "MediaTrackPrevious" {:keyCode 177, :key "MediaTrackPrevious", :code "MediaTrackPrevious"},
   "PageDown"           {:keyCode 34, :key "PageDown", :code "PageDown"},
   "Backspace"          {:keyCode 8, :key "Backspace", :code "Backspace"},
   "F20"                {:keyCode 131, :key "F20", :code "F20"},
   "Space"              {:keyCode 32, :key " ", :code "Space"},
   "F14"                {:keyCode 125, :key "F14", :code "F14"},
   "Numpad8"            {:keyCode 38, :key "ArrowUp", :code "Numpad8", :location 3},
   "Digit6"             {:keyCode 54, :key "^", :code "Digit6"},
   "ControlLeft"        {:keyCode 17, :key "Control", :code "ControlLeft"},
   "F21"                {:keyCode 132, :key "F21", :code "F21"},
   "ArrowUp"            {:keyCode 38, :key "ArrowUp", :code "ArrowUp"},
   "KeyP"               {:keyCode 80, :key "P", :code "KeyP"},
   "F24"                {:keyCode 135, :key "F24", :code "F24"},
   "F19"                {:keyCode 130, :key "F19", :code "F19"},
   "ContextMenu"        {:keyCode 93, :key "ContextMenu", :code "ContextMenu"},
   "Period"             {:keyCode 190, :key ">", :code "Period"},
   "ArrowDown"          {:keyCode 40, :key "ArrowDown", :code "ArrowDown"},
   "Digit9"             {:keyCode 57, :key "(", :code "Digit9"},
   "Equal"              {:keyCode 187, :key "=", :code "Equal"},
   "KeyJ"               {:keyCode 74, :key "J", :code "KeyJ"},
   "NumpadEnter"        {:keyCode 13, :key "Enter", :code "NumpadEnter", :location 3},
   "Digit8"             {:keyCode 56, :key "8", :code "Digit8"},
   "KeyT"               {:keyCode 84, :key "t", :code "KeyT"},
   "Slash"              {:keyCode 191, :key "?", :code "Slash"},
   "Semicolon"          {:keyCode 186, :key ";", :code "Semicolon"},
   "F7"                 {:keyCode 118, :key "F7", :code "F7"},
   "Numpad1"            {:keyCode 35, :key "End", :code "Numpad1", :location 3},
   "F9"                 {:keyCode 120, :key "F9", :code "F9"},
   "Digit1"             {:keyCode 49, :key "1", :code "Digit1"},
   "F6"                 {:keyCode 117, :key "F6", :code "F6"},
   "KeyA"               {:keyCode 65, :key "A", :code "KeyA"},
   "PrintScreen"        {:keyCode 44, :key "PrintScreen", :code "PrintScreen"},
   "F13"                {:keyCode 124, :key "F13", :code "F13"},
   "Numpad0"            {:keyCode 45, :key "Insert", :code "Numpad0", :location 3},
   "Numpad9"            {:keyCode 33, :key "PageUp", :code "Numpad9", :location 3},
   "KeyU"               {:keyCode 85, :key "u", :code "KeyU"},
   "Backquote"          {:keyCode 192, :key "`", :code "Backquote"},
   "End"                {:keyCode 35, :key "End", :code "End"},
   "NumLock"            {:keyCode 144, :key "NumLock", :code "NumLock"},
   "KeyC"               {:keyCode 67, :key "c", :code "KeyC"},
   "Digit3"             {:keyCode 51, :key "#", :code "Digit3"},
   "Open"               {:keyCode 43, :key "Execute", :code "Open"},
   "KeyQ"               {:keyCode 81, :key "q", :code "KeyQ"},
   "KeyV"               {:keyCode 86, :key "V", :code "KeyV"},
   "Tab"                {:keyCode 9, :key "Tab", :code "Tab"},
   "KeyF"               {:keyCode 70, :key "F", :code "KeyF"},
   "Numpad3"            {:keyCode 34, :key "PageDown", :code "Numpad3", :location 3},
   "Convert"            {:keyCode 28, :key "Convert", :code "Convert"},
   "AudioVolumeMute"    {:keyCode 173, :key "AudioVolumeMute", :code "AudioVolumeMute"},
   "Minus"              {:keyCode 189, :key "_", :code "Minus"},
   "F12"                {:keyCode 123, :key "F12", :code "F12"},
   "Comma"              {:keyCode 188, :key ",", :code "Comma"},
   "F23"                {:keyCode 134, :key "F23", :code "F23"},
   "Eject"              {:key "Eject", :code "Eject"},
   "F10"                {:keyCode 121, :key "F10", :code "F10"},
   "KeyX"               {:keyCode 88, :key "X", :code "KeyX"},
   "ArrowRight"         {:keyCode 39, :key "ArrowRight", :code "ArrowRight"},
   "MetaRight"          {:keyCode 92, :key "Meta", :code "MetaRight"},
   "Delete"             {:keyCode 46, :key "Delete", :code "Delete"},
   "Digit5"             {:keyCode 53, :key "5", :code "Digit5"},
   "Numpad2"            {:keyCode 40, :key "ArrowDown", :code "Numpad2", :location 3},
   "F11"                {:keyCode 122, :key "F11", :code "F11"},
   "ArrowLeft"          {:keyCode 37, :key "ArrowLeft", :code "ArrowLeft"},
   "F1"                 {:keyCode 112, :key "F1", :code "F1"},
   "AltRight"           {:keyCode 18, :key "Alt", :code "AltRight", :location 2},
   "Escape"             {:keyCode 27, :key "Escape", :code "Escape"},
   "KeyN"               {:keyCode 78, :key "N", :code "KeyN"},
   "Insert"             {:keyCode 45, :key "Insert", :code "Insert"},
   "AltGraph"           {:keyCode 225, :key "AltGraph", :code "AltGraph"},
   "CapsLock"           {:keyCode 20, :key "CapsLock", :code "CapsLock"},
   "Digit7"             {:keyCode 55, :key "&", :code "Digit7"},
   "NumpadAdd"          {:keyCode 107, :key "+", :code "NumpadAdd", :location 3},
   "KeyR"               {:keyCode 82, :key "r", :code "KeyR"},
   "ShiftRight"         {:keyCode 16, :key "Shift", :code "ShiftRight", :location 2},
   "KeyI"               {:keyCode 73, :key "I", :code "KeyI"},
   "KeyE"               {:keyCode 69, :key "e", :code "KeyE"},
   "NumpadSubtract"     {:keyCode 109, :key "-", :code "NumpadSubtract", :location 3},
   "Backslash"          {:keyCode 220, :key "\\", :code "Backslash"},
   "MediaPlayPause"     {:keyCode 179, :key "MediaPlayPause", :code "MediaPlayPause"},
   "Digit0"             {:keyCode 48, :key "0", :code "Digit0"},
   "F22"                {:keyCode 133, :key "F22", :code "F22"},
   "NumpadMultiply"     {:keyCode 106, :key "*", :code "NumpadMultiply", :location 3},
   "Pause"              {:keyCode 19, :key "Pause", :code "Pause"},
   "Numpad7"            {:keyCode 36, :key "Home", :code "Numpad7", :location 3},
   "AudioVolumeUp"      {:keyCode 175, :key "AudioVolumeUp", :code "AudioVolumeUp"},
   "Numpad5"            {:keyCode 12, :key "Clear", :code "Numpad5", :location 3},
   "AudioVolumeDown"    {:keyCode 174, :key "AudioVolumeDown", :code "AudioVolumeDown"},
   "NonConvert"         {:keyCode 29, :key "NonConvert", :code "NonConvert"},
   "F15"                {:keyCode 126, :key "F15", :code "F15"},
   "F17"                {:keyCode 128, :key "F17", :code "F17"},
   "NumpadEqual"        {:keyCode 187, :key "=", :code "NumpadEqual", :location 3},
   "KeyW"               {:keyCode 87, :key "W", :code "KeyW"},
   "F16"                {:keyCode 127, :key "F16", :code "F16"},
   "F5"                 {:keyCode 116, :key "F5", :code "F5"},
   "KeyK"               {:keyCode 75, :key "k", :code "KeyK"},
   "ScrollLock"         {:keyCode 145, :key "ScrollLock", :code "ScrollLock"},
   "KeyB"               {:keyCode 66, :key "b", :code "KeyB"},
   "MediaStop"          {:keyCode 178, :key "MediaStop", :code "MediaStop"},
   "MediaTrackNext"     {:keyCode 176, :key "MediaTrackNext", :code "MediaTrackNext"},
   "NumpadDecimal"      {:keyCode 46, :key " ", :code "NumpadDecimal", :location 3},
   "ControlRight"       {:keyCode 17, :key "Control", :code "ControlRight", :location 2},
   "F2"                 {:keyCode 113, :key "F2", :code "F2"},
   "Help"               {:keyCode 6, :key "Help", :code "Help"},
   "PageUp"             {:keyCode 33, :key "PageUp", :code "PageUp"},
   "MetaLeft"           {:keyCode 91, :key "Meta", :code "MetaLeft"},
   "F8"                 {:keyCode 119, :key "F8", :code "F8"},
   "ShiftLeft"          {:keyCode 16, :key "Shift", :code "ShiftLeft"},
   "Props"              {:keyCode 247, :key "CrSel", :code "Props"},
   "Digit4"             {:keyCode 52, :key "$", :code "Digit4"},
   "Abort"              {:keyCode 3, :key "Cancel", :code "Abort"},
   "Numpad6"            {:keyCode 39, :key "ArrowRight", :code "Numpad6", :location 3},
   "KeyM"               {:keyCode 77, :key "m", :code "KeyM"},
   "NumpadDivide"       {:keyCode 111, :key "/", :code "NumpadDivide", :location 3},
   "Select"             {:keyCode 41, :key "Select", :code "Select"},
   "KeyD"               {:keyCode 68, :key "D", :code "KeyD"},
   "F4"                 {:keyCode 115, :key "F4", :code "F4"},
   "KeyO"               {:keyCode 79, :key "o", :code "KeyO"},
   "AltLeft"            {:keyCode 18, :key "Alt", :code "AltLeft", :location 1},
   "KeyH"               {:keyCode 72, :key "h", :code "KeyH"},
   "KeyZ"               {:keyCode 90, :key "z", :code "KeyZ"},
   "KeyG"               {:keyCode 71, :key "g", :code "KeyG"},
   "Power"              {:key "Power", :code "Power"},
   "Numpad4"            {:keyCode 37, :key "ArrowLeft", :code "Numpad4", :location 3},
   "F18"                {:keyCode 129, :key "F18", :code "F18"},
   "F3"                 {:keyCode 114, :key "F3", :code "F3"},
   "Enter"              {:keyCode 13, :key "Enter", :code "Enter"},
   "Home"               {:keyCode 36, :key "Home", :code "Home"},
   "KeyS"               {:keyCode 83, :key "s", :code "KeyS"},
   "Quote"              {:keyCode 222, :key "'", :code "Quote"}})