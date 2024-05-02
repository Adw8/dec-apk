package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Recreator implements k3P {
    public final adL R;

    public Recreator(adL adl) {
        this.R = adl;
    }

    @Override // defpackage.k3P
    public final void e(nu_ nu_, alX alx) {
        if (alx == alX.ON_CREATE) {
            nu_.O().v(this);
            Bundle R = this.R.c().R("androidx.savedstate.Restarter");
            if (R != null) {
                ArrayList<String> stringArrayList = R.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String str : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(bT2.class);
                            try {
                                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    bT2 bt2 = (bT2) declaredConstructor.newInstance(new Object[0]);
                                    adL adl = this.R;
                                    if (adl instanceof ly1) {
                                        ns8 e = ((ly1) adl).e();
                                        bhK c = adl.c();
                                        e.getClass();
                                        Iterator it = new HashSet(e.R.keySet()).iterator();
                                        while (it.hasNext()) {
                                            d.R((kvj) e.R.get((String) it.next()), c, adl.O());
                                        }
                                        if (!new HashSet(e.R.keySet()).isEmpty()) {
                                            c.e();
                                        }
                                    } else {
                                        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                } catch (Exception e2) {
                                    throw new RuntimeException(opT.H("Failed to instantiate ", str), e2);
                                }
                            } catch (NoSuchMethodException e3) {
                                StringBuilder U = opT.U("Class ");
                                U.append(asSubclass.getSimpleName());
                                U.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(U.toString(), e3);
                            }
                        } catch (ClassNotFoundException e4) {
                            throw new RuntimeException(jQ.C("Class ", str, " wasn't found"), e4);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
