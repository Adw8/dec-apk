package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: oPm  reason: default package */
/* loaded from: classes.dex */
public final class oPm implements mzq {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hAW f6819R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6820R;

    public /* synthetic */ oPm(hAW haw, String str, int i) {
        this.R = i;
        this.f6819R = haw;
        this.f6820R = str;
    }

    @Override // defpackage.mzq
    public final boolean R(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        int i;
        int i2 = 1;
        switch (this.R) {
            case 0:
                hAW haw = this.f6819R;
                Ho ho = (Ho) haw.f4119R.remove(this.f6820R);
                if (ho == null) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    KP kp = (KP) it.next();
                    if (kp.f253X) {
                        Iterator it2 = kp.f251R.iterator();
                        while (it2.hasNext()) {
                            pm2 pm2 = ((dJb) it2.next()).f2560R;
                            if (pm2 != null) {
                                hashMap.put(pm2.f7238R, pm2);
                            }
                        }
                    }
                }
                HashMap hashMap2 = new HashMap(ho.R.size());
                for (String str2 : ho.R) {
                    pm2 pm22 = (pm2) hashMap.get(str2);
                    if (pm22 != null) {
                        hashMap2.put(pm22.f7238R, pm22);
                    } else {
                        bzM Y = haw.f4127R.Y(str2, null);
                        if (Y != null) {
                            pm2 R = Y.R(haw.A(), haw.f4113R.f3004R.getClassLoader());
                            hashMap2.put(R.f7238R, R);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (H7 h7 : ho.v) {
                    h7.getClass();
                    KP kp2 = new KP(haw);
                    h7.R(kp2);
                    for (int i3 = 0; i3 < h7.f167R.size(); i3++) {
                        String str3 = (String) h7.f167R.get(i3);
                        if (str3 != null) {
                            pm2 pm23 = (pm2) hashMap2.get(str3);
                            if (pm23 != null) {
                                ((dJb) kp2.f251R.get(i3)).f2560R = pm23;
                            } else {
                                StringBuilder U = opT.U("Restoring FragmentTransaction ");
                                U.append(h7.f166R);
                                U.append(" failed due to missing saved state for Fragment (");
                                U.append(str3);
                                U.append(")");
                                throw new IllegalStateException(U.toString());
                            }
                        }
                    }
                    arrayList3.add(kp2);
                }
                Iterator it3 = arrayList3.iterator();
                boolean z = false;
                while (it3.hasNext()) {
                    ((KP) it3.next()).R(arrayList, arrayList2);
                    z = true;
                }
                return z;
            default:
                hAW haw2 = this.f6819R;
                String str4 = this.f6820R;
                int u = haw2.u(-1, str4, true);
                if (u < 0) {
                    return false;
                }
                for (int i4 = u; i4 < haw2.f4136v.size(); i4++) {
                    KP kp3 = (KP) haw2.f4136v.get(i4);
                    if (!kp3.f255c) {
                        haw2.vl(new IllegalArgumentException("saveBackStack(\"" + str4 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + kp3 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                int i5 = u;
                while (i5 < haw2.f4136v.size()) {
                    KP kp4 = (KP) haw2.f4136v.get(i5);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator it4 = kp4.f251R.iterator();
                    while (it4.hasNext()) {
                        dJb djb = (dJb) it4.next();
                        pm2 pm24 = djb.f2560R;
                        if (pm24 != null) {
                            if (!djb.f2561R || (i = djb.R) == i2 || i == 2 || i == 8) {
                                hashSet.add(pm24);
                                hashSet2.add(pm24);
                            }
                            int i6 = djb.R;
                            if (i6 == 1 || i6 == 2) {
                                hashSet3.add(pm24);
                            }
                            i2 = 1;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder i7 = jQ.i("saveBackStack(\"", str4, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        if (hashSet2.size() == 1) {
                            StringBuilder U2 = opT.U(" ");
                            U2.append(hashSet2.iterator().next());
                            str = U2.toString();
                        } else {
                            str = "s " + hashSet2;
                        }
                        i7.append(str);
                        i7.append(" in ");
                        i7.append(kp4);
                        i7.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        haw2.vl(new IllegalArgumentException(i7.toString()));
                        throw null;
                    }
                    i5++;
                    i2 = 1;
                }
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    pm2 pm25 = (pm2) arrayDeque.removeFirst();
                    if (pm25.x) {
                        StringBuilder i8 = jQ.i("saveBackStack(\"", str4, "\") must not contain retained fragments. Found ");
                        i8.append(hashSet.contains(pm25) ? "direct reference to retained " : "retained child ");
                        i8.append("fragment ");
                        i8.append(pm25);
                        haw2.vl(new IllegalArgumentException(i8.toString()));
                        throw null;
                    }
                    Iterator it5 = pm25.f7252v.f4127R.P().iterator();
                    while (it5.hasNext()) {
                        pm2 pm26 = (pm2) it5.next();
                        if (pm26 != null) {
                            arrayDeque.addLast(pm26);
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((pm2) it6.next()).f7238R);
                }
                ArrayList arrayList5 = new ArrayList(haw2.f4136v.size() - u);
                for (int i9 = u; i9 < haw2.f4136v.size(); i9++) {
                    arrayList5.add(null);
                }
                Ho ho2 = new Ho(arrayList4, arrayList5);
                for (int size = haw2.f4136v.size() - 1; size >= u; size--) {
                    KP kp5 = (KP) haw2.f4136v.remove(size);
                    KP kp6 = new KP(kp5);
                    int size2 = kp6.f251R.size();
                    while (true) {
                        size2--;
                        if (size2 >= 0) {
                            dJb djb2 = (dJb) kp6.f251R.get(size2);
                            if (djb2.f2561R) {
                                if (djb2.R == 8) {
                                    djb2.f2561R = false;
                                    size2--;
                                    kp6.f251R.remove(size2);
                                } else {
                                    int i10 = djb2.f2560R.Z;
                                    djb2.R = 2;
                                    djb2.f2561R = false;
                                    for (int i11 = size2 - 1; i11 >= 0; i11--) {
                                        dJb djb3 = (dJb) kp6.f251R.get(i11);
                                        if (djb3.f2561R && djb3.f2560R.Z == i10) {
                                            kp6.f251R.remove(i11);
                                            size2--;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList5.set(size - u, new H7(kp6));
                    kp5.f253X = true;
                    arrayList.add(kp5);
                    arrayList2.add(Boolean.TRUE);
                }
                haw2.f4119R.put(str4, ho2);
                return true;
        }
    }
}
