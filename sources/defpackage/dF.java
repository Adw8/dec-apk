package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: dF */
/* loaded from: classes.dex */
public abstract class dF extends s3 {
    public static final void BF(Iterable iterable, AbstractCollection abstractCollection) {
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static final Object D(Collection collection) {
        if (collection instanceof List) {
            return b((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final boolean F(Iterable iterable, Serializable serializable) {
        int i;
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(serializable);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    pdD.k();
                    throw null;
                } else if (n3x.v(serializable, next)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i = ((List) iterable).indexOf(serializable);
        }
        return i >= 0;
    }

    public static final HashSet Kl(Collection collection) {
        HashSet hashSet = new HashSet(jjU.y(a6.B(collection, 12)));
        BF(collection, hashSet);
        return hashSet;
    }

    public static String X4(Iterable iterable, String str, String str2, String str3, mox mox, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        int i2 = (i & 8) != 0 ? -1 : 0;
        String str6 = (i & 16) != 0 ? "..." : null;
        mox mox2 = (i & 32) != 0 ? null : mox;
        StringBuilder sb = new StringBuilder();
        _(iterable, sb, str, str4, str5, i2, str6, mox2);
        return sb.toString();
    }

    public static final List ZW(Iterable iterable, gvk gvk) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return pG(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array.length > 1) {
                Arrays.sort(array, gvk);
            }
            return Arrays.asList(array);
        }
        List yG = yG(iterable);
        if (((ArrayList) yG).size() > 1) {
            Collections.sort(yG, gvk);
        }
        return yG;
    }

    public static final void _(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, kg9 kg9) {
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            n3x.R(sb, obj, kg9);
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static final pn a(Iterable iterable) {
        return new pn(1, iterable);
    }

    public static final Object b(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final ArrayList cE(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        s3.E(iterable, arrayList2);
        return arrayList2;
    }

    public static final ArrayList cr(Iterable iterable, Object obj) {
        ArrayList arrayList = new ArrayList(a6.B(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && n3x.v(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final ArrayList iE(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final int[] mZ(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            iArr[i] = ((Number) it.next()).intValue();
        }
        return iArr;
    }

    public static final List pG(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return pdD.Q(yG(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return fcD.R;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final Object q(int i, List list) {
        if (i < 0 || i > pdD.i(list)) {
            return null;
        }
        return list.get(i);
    }

    public static final Object vl(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Comparable vr(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final List vz(List list, int i) {
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(opT.m("Requested element count ", i, " is less than zero.").toString());
        } else if (i == 0) {
            return fcD.R;
        } else {
            if (i >= list.size()) {
                return pG(list);
            }
            if (i == 1) {
                return Collections.singletonList(D(list));
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object obj : list) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return pdD.Q(arrayList);
        }
    }

    public static final Object w(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Set wm(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return lsA.R;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(jjU.y(collection.size()));
                BF(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        BF(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        return size2 != 0 ? size2 != 1 ? linkedHashSet2 : Collections.singleton(linkedHashSet2.iterator().next()) : lsA.R;
    }

    public static final List xN(List list) {
        if ((list instanceof Collection) && list.size() <= 1) {
            return pG(list);
        }
        List yG = yG(list);
        Collections.reverse(yG);
        return yG;
    }

    public static final List yG(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        BF(iterable, arrayList);
        return arrayList;
    }

    public static final Object zw(List list) {
        if (!list.isEmpty()) {
            return list.get(pdD.i(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
