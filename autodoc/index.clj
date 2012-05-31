{:namespaces
 ({:source-url nil,
   :wiki-url "clj-rsyntax.rtextarea-api.html",
   :name "clj-rsyntax.rtextarea",
   :author "Jon Rose",
   :doc
   "Wrapper API for org.fife.ui.org.fife.ui.rtextarea.RTextArea.org.fife.ui.rtextarea.RTextArea (http://fifesoft.com/) the\n\topensource text editor  component from RText."}),
 :vars
 ({:arglists ([rta action]),
   :name "action",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/action",
   :doc
   "Provides a way to gain access to the editor actions on the right-click popup menu.",
   :var-type "function",
   :line 64,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta action name mnemonic accelerator]),
   :name "action-properties!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/action-properties!",
   :doc
   "Sets the properties of one of the actions this text area owns.",
   :var-type "function",
   :line 309,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta line color]),
   :name "add-line-highlight!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/add-line-highlight!",
   :doc "Adds a line highlight",
   :var-type "function",
   :line 9,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "background",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/background",
   :doc
   "Returns the java.awt.Color used as the background color for this text area.",
   :var-type "function",
   :line 71,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta bg]),
   :name "background!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/background!",
   :doc "Sets the background color of this text editor.",
   :var-type "function",
   :line 314,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "background-image",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/background-image",
   :doc "Returns the image currently used for the background.",
   :var-type "function",
   :line 76,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta image]),
   :name "background-image!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/background-image!",
   :doc "Sets this image as the background image.",
   :var-type "function",
   :line 319,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "background-object",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/background-object",
   :doc
   "Returns the Object representing the background for all documents in this tabbed pane; either a java.awt.Color or a java.lang.Image containing the image used as the background for this text area.",
   :var-type "function",
   :line 81,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta newBackground]),
   :name "background-object!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/background-object!",
   :doc "Makes the background into this Object.",
   :var-type "function",
   :line 324,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "begin-atomic-edit!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/begin-atomic-edit!",
   :doc "Begins an \"atomic edit.\"",
   :var-type "function",
   :line 14,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "begin-recording-macro!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/begin-recording-macro!",
   :doc "Begins recording macro",
   :var-type "function",
   :line 19,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta caret]),
   :name "caret!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/caret!",
   :doc
   "This method is overridden to make sure that instances of org.fife.ui.rtextarea.RTextArea only use ConfigurableCarets.",
   :var-type "function",
   :line 329,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "caret-line-number",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/caret-line-number",
   :doc " Gets the line number that the caret is on.",
   :var-type "function",
   :line 86,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "caret-offset-from-line-start",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/caret-offset-from-line-start",
   :doc
   "Gets the position from the beginning of the current line that the caret is on.",
   :var-type "function",
   :line 91,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta mode style]),
   :name "caret-style!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/caret-style!",
   :doc
   "Sets the style of caret used when in insert or overwrite mode.",
   :var-type "function",
   :line 334,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "clear-mark-all-highlights!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/clear-mark-all-highlights!",
   :doc "Clears any \"mark all\" highlights, if any.",
   :var-type "function",
   :line 34,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "convert-spaces-to-tabs!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/convert-spaces-to-tabs!",
   :doc
   "Converts all instances of a number of spaces equal to a tab size into a tab in this text area.",
   :var-type "function",
   :line 39,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "convert-tabs-to-spaces!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/convert-tabs-to-spaces!",
   :doc
   "Converts all instances of a tab into a number of spaces equivalent to a tab in this text area.",
   :var-type "function",
   :line 44,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "current-line-high-light-color",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/current-line-high-light-color",
   :doc "Returns the color being used to highlight the current line.",
   :var-type "function",
   :line 96,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta color]),
   :name "current-line-highlight-color!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/current-line-highlight-color!",
   :doc "Sets the color to use to highlight the current line.",
   :var-type "function",
   :line 339,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "current-macro",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/current-macro",
   :doc
   "Returns the macro currently stored in this org.fife.ui.rtextarea.RTextArea.",
   :var-type "function",
   :line 101,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "default-caret-color",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/default-caret-color",
   :doc "Returns the default -caret color.",
   :var-type "function",
   :line 109,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "default-current-line-highlight-color",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/default-current-line-highlight-color",
   :doc
   "Returns the \"default\" color for highlighting the current line.",
   :var-type "function",
   :line 114,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "default-font",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/default-font",
   :doc "Returns the default font for text areas.",
   :var-type "function",
   :line 119,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "default-foreground",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/default-foreground",
   :doc
   "Returns the default foreground color for text in this text area.",
   :var-type "function",
   :line 124,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "default-margin-line-color",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/default-margin-line-color",
   :doc "Returns the default color for the margin line.",
   :var-type "function",
   :line 129,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "default-margin-line-position",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/default-margin-line-position",
   :doc "Returns the default margin line position.",
   :var-type "function",
   :line 134,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "default-mark-all-highlight-color",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/default-mark-all-highlight-color",
   :doc "Returns the default color used for \"mark all.\"",
   :var-type "function",
   :line 139,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "default-tab-size",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/default-tab-size",
   :doc "Returns the default tab size, in spaces.",
   :var-type "function",
   :line 144,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "discard-all-edits!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/discard-all-edits!",
   :doc
   "Removes all undoable edits from this document's undo manager.",
   :var-type "function",
   :line 49,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta document]),
   :name "document!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/document!",
   :doc "Sets the document used by this text area.",
   :var-type "function",
   :line 344,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "end-atomic-edit!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/end-atomic-edit!",
   :doc "Completes an \"atomic\" edit.",
   :var-type "function",
   :line 54,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "end-recording-macro!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/end-recording-macro!",
   :doc "Ends recording a macro.",
   :var-type "function",
   :line 59,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta fade]),
   :name "fade-current-line-highlight!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/fade-current-line-highlight!",
   :doc
   "Sets whether the current line highlight should have a \"fade\" effect.",
   :var-type "function",
   :line 349,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "fade-current-line-highlight?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/fade-current-line-highlight?",
   :doc "Returns whether the current line highlight is faded.",
   :var-type "function",
   :line 149,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta font]),
   :name "font!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/font!",
   :doc "Sets the font for this text area.",
   :var-type "function",
   :line 354,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta highlight]),
   :name "highlight-current-line!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/highlight-current-line!",
   :doc "Sets whether or not the current line is highlighted.",
   :var-type "function",
   :line 359,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "highlight-current-line?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/highlight-current-line?",
   :doc "Returns whether or not the current line is highlighted.",
   :var-type "function",
   :line 154,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "icon-group",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/icon-group",
   :doc
   "Returns the icon group being used for the actions of this text area.",
   :var-type "function",
   :line 159,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta group]),
   :name "icon-group!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/icon-group!",
   :doc
   "Sets the path in which to find images to associate with the editor's actions.",
   :var-type "function",
   :line 364,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "line-end-offset-of-current-line",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/line-end-offset-of-current-line",
   :doc
   "Returns the offset of the last character of the line that the caret is on.",
   :var-type "function",
   :line 164,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "line-height",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/line-height",
   :doc "Returns the height of a line of text in this text area.",
   :var-type "function",
   :line 169,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "line-start-offset-of-current-line",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/line-start-offset-of-current-line",
   :doc
   "Returns the offset of the first character of the line that the caret is on.",
   :var-type "function",
   :line 174,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta wrap]),
   :name "line-wrap!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/line-wrap!",
   :doc "Sets whether or not word wrap is enabled.",
   :var-type "function",
   :line 369,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta macro]),
   :name "load-macro!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/load-macro!",
   :doc
   "Loads a macro to be used by all org.fife.ui.rtextarea.RTextAreas in the current application.",
   :var-type "function",
   :line 254,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "margin-line-color",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/margin-line-color",
   :doc "Returns the color used to paint the margin line.",
   :var-type "function",
   :line 179,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta color]),
   :name "margin-line-color!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/margin-line-color!",
   :doc "Sets the color used to paint the margin line.",
   :var-type "function",
   :line 374,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta enabled]),
   :name "margin-line-enabled!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/margin-line-enabled!",
   :doc "Enables or disables the margin line.",
   :var-type "function",
   :line 379,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "margin-line-enabled?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/margin-line-enabled?",
   :doc "Returns whether or not the margin line is being painted.",
   :var-type "function",
   :line 239,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "margin-line-pixel-location",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/margin-line-pixel-location",
   :doc
   "Returns the margin line position (in pixels) from the left-hand side of the text area.",
   :var-type "function",
   :line 184,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "margin-line-position",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/margin-line-position",
   :doc
   "Returns the margin line position (which is the number of 'm' widths in the current font the margin line is over).",
   :var-type "function",
   :line 189,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta size]),
   :name "margin-line-position!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/margin-line-position!",
   :doc "Sets the number of 'm' widths the margin line is over.",
   :var-type "function",
   :line 384,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta toMark matchCase wholeWord regex]),
   :name "mark-all!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/mark-all!",
   :doc "Marks all instances of the specified text in this text area.",
   :var-type "function",
   :line 259,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta color]),
   :name "mark-all-highlight-color",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/mark-all-highlight-color",
   :doc "Sets the color used for \"mark all.\"",
   :var-type "function",
   :line 389,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "max-ascent",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/max-ascent",
   :doc
   "Returns the maximum ascent of all fonts used in this text area.",
   :var-type "function",
   :line 199,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "osx?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/osx?",
   :doc "Returns whether the OS we're running on is OS X.",
   :var-type "function",
   :line 244,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "paste!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/paste!",
   :doc "Paste",
   :var-type "function",
   :line 264,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "playback-last-macro!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/playback-last-macro!",
   :doc "\"Plays back\" the last recorded macro in this text area.",
   :var-type "function",
   :line 269,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta popupMenu]),
   :name "popup-menu",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/popup-menu",
   :doc "Sets the popup menu used by this text area.",
   :var-type "function",
   :line 394,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta g pageFormat pageIndex]),
   :name "print-rta",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/print-rta",
   :doc
   "Method called when it's time to print this badboy (the old-school, AWT way).",
   :var-type "function",
   :line 274,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta in desc]),
   :name "read!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/read!",
   :doc
   "We override this method because the super version gives us an entirely new Document, thus requiring us to re-attach our Undo manager.",
   :var-type "function",
   :line 279,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "recording-macro?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/recording-macro?",
   :doc "Returns whether or not a macro is being recorded.",
   :var-type "function",
   :line 249,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "redo-last-action!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/redo-last-action!",
   :doc "Attempt to redo the last action.",
   :var-type "function",
   :line 284,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "redo?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/redo?",
   :doc "Tells whether a redo is possible",
   :var-type "function",
   :line 24,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "remove-all-line-highlights!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/remove-all-line-highlights!",
   :doc "Removes all line highlights.",
   :var-type "function",
   :line 289,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta tag]),
   :name "remove-line-highlight!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/remove-line-highlight!",
   :doc "Removes a line highlight.",
   :var-type "function",
   :line 294,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta s start end]),
   :name "replace-range",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/replace-range",
   :doc
   "Replaces text from the indicated start to end position with the new text specified.",
   :var-type "function",
   :line 299,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta text]),
   :name "replace-selection",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/replace-selection",
   :doc
   "This method overrides JTextComponent's replaceSelection, so that if textMode is OVERWRITE_MODE, it actually overwrites.",
   :var-type "function",
   :line 304,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta rounded]),
   :name "rounded-selection-edges",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/rounded-selection-edges",
   :doc
   "Sets whether the edges of selections are rounded in this text area. This method fires a property change of type org.fife.ui.rtextarea.RTextAreaBase.ROUNDED_SELECTION_PROPERTY.",
   :var-type "function",
   :line 399,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "rounded-selection-edges?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/rounded-selection-edges?",
   :doc
   "Returns whether selection edges are rounded in this text area.",
   :var-type "function",
   :line 209,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "selected-occurrence-text",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/selected-occurrence-text",
   :doc
   "Returns the text last selected and used in a Ctrl+K operation.",
   :var-type "function",
   :line 214,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta text]),
   :name "selected-occurrence-text!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/selected-occurrence-text!",
   :doc
   "Sets the text last selected/Ctrl+K'd in an org.fife.ui.rtextarea.RTextArea.",
   :var-type "function",
   :line 404,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta size]),
   :name "tab-size!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/tab-size!",
   :doc
   "Workaround, since in JDK1.4 it appears that setTabSize() doesn't work for a JTextArea unless you use the constructor specifying the number of rows and columns.",
   :var-type "function",
   :line 414,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta are-emulated]),
   :name "tabs-emulated!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/tabs-emulated!",
   :doc
   "Changes whether or not tabs should be emulated with spaces (i.e., soft tabs).",
   :var-type "function",
   :line 409,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "tabs-emulated?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/tabs-emulated?",
   :doc
   "Returns whether or not tabs are emulated with spaces (i.e., \"soft\" tabs).",
   :var-type "function",
   :line 219,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "text-mode",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/text-mode",
   :doc "Returns the text mode this editor pane is currently in.",
   :var-type "function",
   :line 224,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta mode]),
   :name "text-mode!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/text-mode!",
   :doc "Sets the text mode for this editor pane.",
   :var-type "function",
   :line 419,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "tool-tip-supplier",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/tool-tip-supplier",
   :doc "Returns the tool tip supplier.",
   :var-type "function",
   :line 229,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta supplier]),
   :name "tool-tip-supplier!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/tool-tip-supplier!",
   :doc "Sets the tool tip supplier.",
   :var-type "function",
   :line 424,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta e]),
   :name "tool-tip-text",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/tool-tip-text",
   :doc
   "Returns the tooltip to display for a mouse event at the given location.",
   :var-type "function",
   :line 234,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta ui]),
   :name "ui!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/ui!",
   :doc "Sets the UI used by this text area.",
   :var-type "function",
   :line 429,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "undo-last-action!",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/undo-last-action!",
   :doc "Attempt to undo an \"action\" done in this text area.",
   :var-type "function",
   :line 434,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta]),
   :name "undo?",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/undo?",
   :doc "Tells whether a undo is possible",
   :var-type "function",
   :line 29,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta line]),
   :name "y-for-line",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/y-for-line",
   :doc "Returns the y-coordinate of the specified line.",
   :var-type "function",
   :line 439,
   :file "src/clj_rsyntax/rtextarea.clj"}
  {:arglists ([rta offs]),
   :name "y-for-line-containing",
   :namespace "clj-rsyntax.rtextarea",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "/clj-rsyntax.rtextarea-api.html#clj-rsyntax.rtextarea/y-for-line-containing",
   :doc "Returns the y-coordinate of the line containing an offset.",
   :var-type "function",
   :line 444,
   :file "src/clj_rsyntax/rtextarea.clj"})}
