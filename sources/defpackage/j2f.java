package defpackage;

import dev.kdrag0n.virt.control.DiskReportStats;
import dev.kdrag0n.virt.control.NetStartPortForward;
import dev.kdrag0n.virt.control.SysRunCommand;
import dev.kdrag0n.virt.control.SysRunCommandResponse;
import dev.kdrag0n.virt.control.UsbDeviceAttach;

/* renamed from: j2f  reason: default package */
/* loaded from: classes.dex */
public interface j2f {
    public static final fjr R = fjr.R;

    @dQV("/sys/shutdown")
    Object L(aOO<? super o8s> aoo);

    @dQV("/usb/attach_device")
    Object O(@sQ UsbDeviceAttach usbDeviceAttach, aOO<? super o8s> aoo);

    @dQV("/sys/sync")
    Object R(aOO<? super o8s> aoo);

    @dQV("/net/start_port_forward")
    Object X(@sQ NetStartPortForward netStartPortForward, aOO<? super o8s> aoo);

    @dQV("/sys/run_command")
    Object c(@sQ SysRunCommand sysRunCommand, aOO<? super SysRunCommandResponse> aoo);

    @dQV("/sys/emergency_shutdown")
    Object e(aOO<? super o8s> aoo);

    @dQV("/disk/report_stats")
    Object v(@sQ DiskReportStats diskReportStats, aOO<? super o8s> aoo);
}
