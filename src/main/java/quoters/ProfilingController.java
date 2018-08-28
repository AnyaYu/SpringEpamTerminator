package quoters;

public class ProfilingController implements ProfilingControllerMBean {
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    private boolean enabled;
}
