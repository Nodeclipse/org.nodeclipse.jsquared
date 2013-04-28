

### Materials

http://wiki.eclipse.org/FAQ_What_is_the_difference_between_a_view_and_an_editor%3F



        There is generally only one instance of a given view per workbench page, but there can be several instances of the same type of editor.
        Editors can appear in only one region of the page, whereas views can be moved to any part of the page and minimized as fast views.
        Editors can be in a dirty state, meaning that their contents are unsaved and will be lost if the editor is closed without saving.
        Views have a local toolbar, whereas editors contribute buttons to the global toolbar.
        Editors can be associated with a file name or an extension, and this association can be changed by users.


Eclipse RCP: programmatically associate files type with Editor?
http://stackoverflow.com/questions/15877123/eclipse-rcp-programmatically-associate-files-type-with-editor

Eclipse plugin: How to extend perspective with View, that is implemented by external plugin
http://stackoverflow.com/questions/16254267/eclipse-plugin-how-to-extend-perspective-with-view-that-is-implemented-by-exte