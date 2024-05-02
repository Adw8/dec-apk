package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: m6J  reason: default package */
/* loaded from: classes.dex */
public final class m6J extends aFk implements iv7 {
    public final /* synthetic */ TerminalViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f5926R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5927R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String[] f5928R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public m6J(TerminalViewModel terminalViewModel, String str, boolean z, String[] strArr, aOO aoo) {
        super(2, aoo);
        this.R = terminalViewModel;
        this.f5926R = str;
        this.f5927R = z;
        this.f5928R = strArr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((m6J) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        b1n b1n;
        ihm ihm;
        Object obj2;
        String str;
        Object obj3;
        jjU.o(obj);
        aME ame = this.R.f2792R;
        String str2 = this.f5926R;
        ArrayList arrayList = ame.f853R;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (n3x.v(((b1n) obj3).R, str2)) {
                    break;
                }
            }
            b1n = (b1n) obj3;
        } else {
            b1n = null;
        }
        if (b1n == null) {
            kxm.v(cUF.v(ame), 5, opT.H("Container not found: ", str2), null);
            dM_ dm_ = (dM_) d7V.f2502R.get(str2);
            if (dm_ == null || (str = dm_.v) == null) {
                str = str2;
            }
            b1n = new b1n(str2, str, true);
        }
        TerminalViewModel terminalViewModel = this.R;
        ivW ivw = terminalViewModel.f2800v;
        if (this.f5927R) {
            ihm = terminalViewModel.f2799R.R(b1n, this.f5928R);
        } else {
            m_e m_e = terminalViewModel.f2799R;
            List list = (List) m_e.f6069R.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (n3x.v(((ihm) obj2).v, b1n.R)) {
                    break;
                }
            }
            ihm ihm2 = (ihm) obj2;
            ihm = ihm2 == null ? m_e.R(b1n, null) : ihm2;
        }
        ivw.H(ihm);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new m6J(this.R, this.f5926R, this.f5927R, this.f5928R, aoo);
    }
}
