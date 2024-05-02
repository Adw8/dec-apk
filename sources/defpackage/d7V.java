package defpackage;

import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: d7V  reason: default package */
/* loaded from: classes.dex */
public abstract class d7V {
    public static final ArrayList R;

    /* renamed from: R  reason: collision with other field name */
    public static final LinkedHashMap f2502R;

    /* renamed from: R  reason: collision with other field name */
    public static final List f2503R;

    static {
        List Y = pdD.Y(new dM_("alpine/edge", "Alpine", (String) null, (int) R.drawable.distro_alpine, 12), new dM_("archlinux/current", "Arch", "arch", (int) R.drawable.distro_arch, 4), new dM_("centos/9-Stream", "CentOS", (String) null, (int) R.drawable.distro_centos, 12), new dM_("debian/bullseye", "Debian", (String) null, (int) R.drawable.distro_debian, 12), new dM_("fedora/36", "Fedora", (String) null, (int) R.drawable.distro_fedora, 12), new dM_("gentoo/current", "Gentoo", (String) null, (int) R.drawable.distro_gentoo, 12), new dM_("kali/current", "Kali", (String) null, (int) R.drawable.distro_kali, 12), new dM_("opensuse/tumbleweed", "openSUSE", (String) null, (int) R.drawable.distro_suse, 12), new dM_("ubuntu/kinetic", "Ubuntu", (String) null, (int) R.drawable.distro_ubuntu, 12), new dM_("voidlinux/current", "Void", "void", (int) R.drawable.distro_void, 4), new dM_("nixos", "NixOS", (int) R.drawable.distro_nixos, "vchost", "nixos"));
        List Y2 = pdD.Y(new dM_("kinetic", "Ubuntu (full)", (int) R.drawable.distro_ubuntu, "ubuntu", "ubuntu-full"), new dM_("jammy", "Ubuntu (LTS)", (int) R.drawable.distro_ubuntu, "ubuntu", "ubuntu-lts"), new dM_("debian/bookworm", "Debian (testing)", "debian-testing", (int) R.drawable.distro_debian, 4), new dM_("devuan/chimaera", "Devuan", (String) null, 0, 28), new dM_("almalinux/9", "AlmaLinux", (String) null, (int) R.drawable.distro_alma, 12), new dM_("amazonlinux/current", "Amazon Linux", (String) null, 0, 28), new dM_("apertis/v2021", "Apertis", (String) null, 0, 28), new dM_("oracle/9", "Oracle Linux", (String) null, 0, 28), new dM_("rockylinux/9", "Rocky Linux", (String) null, 0, 28));
        f2503R = Y2;
        ArrayList cE = dF.cE(Y2, Y);
        R = cE;
        int y = jjU.y(a6.B(cE, 10));
        if (y < 16) {
            y = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(y);
        Iterator it = cE.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((dM_) next).e, next);
        }
        f2502R = linkedHashMap;
    }
}
