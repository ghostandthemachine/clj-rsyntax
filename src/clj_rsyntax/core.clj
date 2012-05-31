(ns  ^{:doc
"Wrapper API for org.fife.ui.rtextarea.RTextArea (http://fifesoft.com/) the
	opensource text editor  component from RText."
      :author "Jon Rose"}
	clj-rsyntax.core
  (:import [org.fife.ui.rtextarea RTextArea Macro IconGroup ToolTipSupplier])
  (:import (javax.swing JPopupMenu)))

(defn add-line-highlight! 
	"Adds a line highlight"
	[^RTextArea rta line color]
	(.addLineHightlight rta line color))

(defn begin-atomic-edit!
	"Begins an \"atomic edit.\""
	[^RTextArea rta]
	(.beginAtomicEdit rta))

(defn begin-recording-macro!
	"Begins recording macro"
	[^RTextArea rta]
	(RTextArea/beginRecordingMacro rta))

(defn redo?
	"Tells whether a redo is possible"
	[^RTextArea rta]
	(.canRedo rta))

(defn undo?
	"Tells whether a undo is possible"
	[^RTextArea rta]
	(.canUndo rta))

(defn clear-mark-all-highlights!
	"Clears any \"mark all\" highlights, if any."
	[^RTextArea rta]
	(.clearMarkAllHighlights rta))

(defn convert-spaces-to-tabs!
	"Converts all instances of a number of spaces equal to a tab size into a tab in this text area."
	[^RTextArea rta]
	(.convertSpacesToTabs rta))

(defn convert-tabs-to-spaces!
	"Converts all instances of a tab into a number of spaces equivalent to a tab in this text area."
	[^RTextArea rta]
	(.convertTabsToSpaces rta))

(defn discard-all-edits!
	"Removes all undoable edits from this document's undo manager."
	[^RTextArea rta]
	(.discardAllEdits rta))

(defn end-atomic-edit! 
  "Completes an \"atomic\" edit."
	[^RTextArea rta]
	(.endAtomicEdit rta))

(defn end-recording-macro!
	"Ends recording a macro."
	[^RTextArea rta]
	(RTextArea/endRecordingMacro rta))

(defn action
	"Provides a way to gain access to the editor actions on the right-click popup menu."
	[^RTextArea rta action]
	(.getAction rta action))

;; Background information

(defn background
	"Returns the java.awt.Color used as the background color for this text area."
	[^RTextArea rta]
	(.getBackground rta))

(defn background-image
	"Returns the image currently used for the background."
	[^RTextArea rta]
	(.getBackgroundImage rta))

(defn background-object
	"Returns the Object representing the background for all documents in this tabbed pane; either a java.awt.Color or a java.lang.Image containing the image used as the background for this text area."
	[^RTextArea rta]
	(.getBackgroundObject rta))

(defn caret-line-number
	" Gets the line number that the caret is on."
	[^RTextArea rta]
	(.getCaretLineNumber rta)) 

(defn caret-offset-from-line-start
	"Gets the position from the beginning of the current line that the caret is on."
	[^RTextArea rta]
	(.getCaretOffsetFromLineStart rta))
          
(defn current-line-high-light-color
	"Returns the color being used to highlight the current line."
	[^RTextArea rta]
	(.getCurrentLineHighlightColor rta))
          
(defn current-macro
	"Returns the macro currently stored in this RTextArea."
	[^RTextArea rta]
	(.getCurrentMacro rta))

;; Defaults
;; get the default values of editor colors, caret params and tab dimensions

(defn default-caret-color
	"Returns the default -caret color."
	[^RTextArea rta]
	(RTextArea/getDefaultCaretColor rta))
          
(defn default-current-line-highlight-color
	"Returns the \"default\" color for highlighting the current line."
	[^RTextArea rta]
	(RTextArea/getDefaultCurrentLineHighlightColor rta))
          
(defn default-font
	"Returns the default font for text areas."
	[^RTextArea rta]
	(RTextArea/getDefaultFont rta))
          
(defn default-foreground
	"Returns the default foreground color for text in this text area."
	[^RTextArea rta]
	(RTextArea/getDefaultForeground rta))
          
(defn default-margin-line-color
	"Returns the default color for the margin line."
	[^RTextArea rta]
	(RTextArea/getDefaultMarginLineColor rta))
          
(defn default-margin-line-position
	"Returns the default margin line position."
	[^RTextArea rta]
	(RTextArea/getDefaultMarginLinePosition rta))
          
(defn default-mark-all-highlight-color
	"Returns the default color used for \"mark all.\""
	[^RTextArea rta]
	(RTextArea/getDefaultMarkAllHighlightColor rta))
          
(defn default-tab-size
	"Returns the default tab size, in spaces."
	[^RTextArea rta]
	(RTextArea/getDefaultTabSize rta))
          
(defn fade-current-line-highlight?
	"Returns whether the current line highlight is faded."
	[^RTextArea rta]
	(.getFadeCurrentLineHighlight rta))
          
(defn highlight-current-line?
	"Returns whether or not the current line is highlighted."
	[^RTextArea rta]
	(.getHighlightCurrentLine rta))
          
(defn icon-group
	"Returns the icon group being used for the actions of this text area."
	[^RTextArea rta]
	(RTextArea/getIconGroup rta))
          
(defn line-end-offset-of-current-line
	"Returns the offset of the last character of the line that the caret is on."
	[^RTextArea rta]
	(.getLineEndOffsetOfCurrentLine rta))
          
(defn line-height
	"Returns the height of a line of text in this text area."
	[^RTextArea rta]
	(.getLineHeight rta))
          
(defn line-start-offset-of-current-line
	"Returns the offset of the first character of the line that the caret is on."
	[^RTextArea rta]
	(.getLineStartOffsetOfCurrentLine rta))
          
(defn margin-line-color
	"Returns the color used to paint the margin line."
	[^RTextArea rta]
	(.getMarginLineColor rta))
          
(defn margin-line-pixel-location
	"Returns the margin line position (in pixels) from the left-hand side of the text area."
	[^RTextArea rta]
	(.getMarginLinePixelLocation rta))
          
(defn margin-line-position
	"Returns the margin line position (which is the number of 'm' widths in the current font the margin line is over)."
	[^RTextArea rta]
	(.getMarginLinePosition rta))
          
(defn mark-all-highlight-color
	"Returns the color used in \"mark all.\""
	[^RTextArea rta]
	(.getMarkAllHighlightColor rta))   

(defn max-ascent
	"Returns the maximum ascent of all fonts used in this text area."
	[^RTextArea rta]
	(.getMaxAscent rta))     

(defn popup-menu
	"Returns the popup menu for this component, lazily creating it if necessary."
	[^RTextArea rta]
	(.getPopupMenu rta))     

(defn rounded-selection-edges?
	"Returns whether selection edges are rounded in this text area."
	[^RTextArea rta]
	(.getRoundedSelectionEdges rta))     

(defn selected-occurrence-text
	"Returns the text last selected and used in a Ctrl+K operation."
	[^RTextArea rta]
	(RTextArea/getSelectedOccurrenceText rta))     

(defn tabs-emulated?
	"Returns whether or not tabs are emulated with spaces (i.e., \"soft\" tabs)."
	[^RTextArea rta]
	(.getTabsEmulated rta))     

(defn text-mode
	"Returns the text mode this editor pane is currently in."
	[^RTextArea rta]
	(.getTextMode rta))     

(defn tool-tip-supplier
	"Returns the tool tip supplier."
	[^RTextArea rta]
	(.getToolTipSupplier rta))     

(defn tool-tip-text
	"Returns the tooltip to display for a mouse event at the given location."
	[^RTextArea rta ^java.awt.event.MouseEvent e]
	(.getToolTipText rta e))     

(defn margin-line-enabled?
	"Returns whether or not the margin line is being painted."
	[^RTextArea rta]
	(.isMarginLineEnabled rta))     

(defn osx?
	"Returns whether the OS we're running on is OS X."
	[^RTextArea rta]
	(RTextArea/isOSX rta))     

(defn recording-macro?
	"Returns whether or not a macro is being recorded."
	[^RTextArea rta]
	(RTextArea/isRecordingMacro rta))     

(defn load-macro!
	"Loads a macro to be used by all RTextAreas in the current application."
	[^RTextArea rta ^org.fife.ui.rtextarea.Macro macro]
	(RTextArea/loadMacro rta macro))     

(defn mark-all!
	"Marks all instances of the specified text in this text area."
	[^RTextArea rta ^java.lang.String toMark matchCase wholeWord regex]
	(.markAll rta toMark matchCase wholeWord regex))     

(defn paste!
	"Paste"
	[^RTextArea rta]
	(.paste rta))     

(defn playback-last-macro!
	"\"Plays back\" the last recorded macro in this text area."
	[^RTextArea rta]
	(.playbackLastMacro rta))     

(defn print-rta
	"Method called when it's time to print this badboy (the old-school, AWT way)."
	[^RTextArea rta ^java.awt.Graphics g ^java.awt.print.PageFormat pageFormat pageIndex]
	(.print rta g pageFormat pageIndex))     

(defn read! 
	"We override this method because the super version gives us an entirely new Document, thus requiring us to re-attach our Undo manager."
	[^RTextArea rta ^java.io.Reader in ^java.lang.Object desc]
	(.read rta in desc))     

(defn redo-last-action!
	"Attempt to redo the last action."
	[^RTextArea rta]
	(.redoLastAction rta))     

(defn remove-all-line-highlights!
	"Removes all line highlights."
	[^RTextArea rta]
	(.removeAllLineHighlights rta))     

(defn remove-line-highlight!
	"Removes a line highlight."
	[^RTextArea rta ^java.lang.Object tag]
	(.removeLineHighlight rta tag))     

(defn replace-range
	"Replaces text from the indicated start to end position with the new text specified."
	[^RTextArea rta ^java.lang.String s start end]
	(.replaceRange rta s start end))     

(defn replace-selection
	"This method overrides JTextComponent's replaceSelection, so that if textMode is OVERWRITE_MODE, it actually overwrites."
	[^RTextArea rta ^java.lang.String text]
	(.replaceSelection rta text))     

(defn action-properties!
	"Sets the properties of one of the actions this text area owns."
	[^RTextArea rta action ^java.lang.String name mnemonic ^javax.swing.KeyStroke accelerator]
	(.setActionProperties rta action name mnemonic accelerator))     

(defn background!
	"Sets the background color of this text editor."
	[^RTextArea rta ^java.awt.Color bg]
	(.setBackground rta bg))     

(defn background-image!
	"Sets this image as the background image."
	[^RTextArea rta ^java.awt.Image image]
	(.setBackgroundImage rta image))     

(defn background-object!
	"Makes the background into this Object."
	[^RTextArea rta ^java.lang.Object newBackground]
	(.setBackgroundObject rta newBackground))     

(defn caret!
	"This method is overridden to make sure that instances of RTextArea only use ConfigurableCarets."
	[^RTextArea rta ^javax.swing.text.Caret caret]
	(.setCaret rta caret))     

(defn caret-style!
	"Sets the style of caret used when in insert or overwrite mode."
	[^RTextArea rta mode style]
	(.setCaretStyle rta mode style))     

(defn current-line-highlight-color!
	"Sets the color to use to highlight the current line."
	[^RTextArea rta ^java.awt.Color color]
	(.setCurrentLineHighlightColor rta color))       

(defn document!
	"Sets the document used by this text area."
	[^RTextArea rta ^javax.swing.text.Document document]
	(.setDocument rta document))     

(defn fade-current-line-highlight!
	"Sets whether the current line highlight should have a \"fade\" effect."
	[^RTextArea rta fade]
	(.setFadeCurrentLineHighlight rta fade))     

(defn font!
	"Sets the font for this text area."
	[^RTextArea rta ^java.awt.Font font]
	(.setFont rta font))     

(defn highlight-current-line!
	"Sets whether or not the current line is highlighted."
	[^RTextArea rta highlight]
	(.setHighlightCurrentLine rta highlight))     

(defn icon-group!
	"Sets the path in which to find images to associate with the editor's actions."
	[^RTextArea rta ^org.fife.ui.rtextarea.IconGroup group]
	(.setIconGroup rta group))     

(defn line-wrap!
	"Sets whether or not word wrap is enabled."
	[^RTextArea rta wrap]
	(.setLineWrap rta wrap))     

(defn margin-line-color!
	"Sets the color used to paint the margin line."
	[^RTextArea rta ^java.awt.Color color]
	(.setMarginLineColor rta color))     

(defn margin-line-enabled!
	"Enables or disables the margin line."
	[^RTextArea rta enabled]
	(.setMarginLineEnabled rta enabled))     

(defn margin-line-position!
	"Sets the number of 'm' widths the margin line is over."
	[^RTextArea rta size]
	(.setMarginLinePosition rta  size))     

(defn mark-all-highlight-color
	"Sets the color used for \"mark all.\""
	[^RTextArea rta ^java.awt.Color color]
	(.setMarkAllHighlightColor rta color))     

(defn popup-menu
	"Sets the popup menu used by this text area."
	[^RTextArea rta ^javax.swing.JPopupMenu popupMenu]
	(.setPopupMenu rta popupMenu))     

(defn rounded-selection-edges
	"Sets whether the edges of selections are rounded in this text area. This method fires a property change of type RTextAreaBase.ROUNDED_SELECTION_PROPERTY."
	[^RTextArea rta rounded]
	(.setRoundedSelectionEdges rta rounded))      

(defn selected-occurrence-text!
	"Sets the text last selected/Ctrl+K'd in an RTextArea."
	[^RTextArea rta ^java.lang.String text]
	(.setSelectedOccurrenceText rta text))     

(defn tabs-emulated!
	"Changes whether or not tabs should be emulated with spaces (i.e., soft tabs)."
	[^RTextArea rta are-emulated]
	(.setTabsEmulated rta are-emulated))     

(defn tab-size!
	"Workaround, since in JDK1.4 it appears that setTabSize() doesn't work for a JTextArea unless you use the constructor specifying the number of rows and columns."
	[^RTextArea rta size]
	(.setTabSize rta size))     

(defn text-mode!
	"Sets the text mode for this editor pane."
	[^RTextArea rta mode]
	(.setTextMode rta))     

(defn tool-tip-supplier!
	"Sets the tool tip supplier."
	[^RTextArea rta ^ToolTipSupplier supplier]
	(.setToolTipSupplier rta supplier))     

(defn ui!
	"Sets the UI used by this text area."
	[^RTextArea rta ^javax.swing.plaf.TextUI ui]
	(.setUI rta ui))     

(defn undo-last-action!
	"Attempt to undo an \"action\" done in this text area."
	[^RTextArea rta]
	(.undoLastAction rta))     

(defn y-for-line
	"Returns the y-coordinate of the specified line."
	[^RTextArea rta line]
	(.yForLine rta line))     

(defn y-for-line-containing
	"Returns the y-coordinate of the line containing an offset."
	[^RTextArea rta offs]
	(.yForLineContaining rta offs))     

