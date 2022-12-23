package com.utkudogan.viewer;
/** Localizable strings for {@link com.utkudogan.viewer}. */
class Bundle {
    /**
     * @return <i>DeviceViewer</i>
     * @see DeviceViewerTopComponent
     */
    static String CTL_DeviceViewerAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_DeviceViewerAction");
    }
    /**
     * @return <i>DeviceViewer Window</i>
     * @see DeviceViewerTopComponent
     */
    static String CTL_DeviceViewerTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_DeviceViewerTopComponent");
    }
    /**
     * @return <i>This is a DeviceViewer window</i>
     * @see DeviceViewerTopComponent
     */
    static String HINT_DeviceViewerTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_DeviceViewerTopComponent");
    }
    private Bundle() {}
}
