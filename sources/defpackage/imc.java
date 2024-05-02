package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: imc  reason: default package */
/* loaded from: classes.dex */
public final class imc {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final Map f4723R;

    /* renamed from: R  reason: collision with other field name */
    public final Set f4724R;
    public final Set v;

    public imc(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.R = str;
        this.f4723R = Collections.unmodifiableMap(hashMap);
        this.f4724R = Collections.unmodifiableSet(hashSet);
        this.v = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static imc R(iUj iuj, String str) {
        Cursor Z = iuj.Z("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (Z.getColumnCount() > 0) {
                int columnIndex = Z.getColumnIndex("name");
                int columnIndex2 = Z.getColumnIndex("type");
                int columnIndex3 = Z.getColumnIndex("notnull");
                int columnIndex4 = Z.getColumnIndex("pk");
                int columnIndex5 = Z.getColumnIndex("dflt_value");
                while (Z.moveToNext()) {
                    String string = Z.getString(columnIndex);
                    hashMap.put(string, new kMM(string, Z.getString(columnIndex2), Z.getInt(columnIndex3) != 0, Z.getInt(columnIndex4), Z.getString(columnIndex5), 2));
                }
            }
            Z.close();
            HashSet hashSet = new HashSet();
            Z = iuj.Z("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = Z.getColumnIndex("id");
                int columnIndex7 = Z.getColumnIndex("seq");
                int columnIndex8 = Z.getColumnIndex("table");
                int columnIndex9 = Z.getColumnIndex("on_delete");
                int columnIndex10 = Z.getColumnIndex("on_update");
                ArrayList v = v(Z);
                int count = Z.getCount();
                for (int i = 0; i < count; i++) {
                    Z.moveToPosition(i);
                    if (Z.getInt(columnIndex7) != 0) {
                        columnIndex6 = columnIndex6;
                        columnIndex7 = columnIndex7;
                        v = v;
                        count = count;
                    } else {
                        int i2 = Z.getInt(columnIndex6);
                        columnIndex6 = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        columnIndex7 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = v.iterator();
                        while (it.hasNext()) {
                            paX pax = (paX) it.next();
                            if (pax.e == i2) {
                                arrayList.add(pax.R);
                                arrayList2.add(pax.v);
                            }
                            count = count;
                            v = v;
                        }
                        v = v;
                        count = count;
                        hashSet.add(new fIC(Z.getString(columnIndex8), Z.getString(columnIndex9), Z.getString(columnIndex10), arrayList, arrayList2));
                    }
                }
                Z.close();
                Z = iuj.Z("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = Z.getColumnIndex("name");
                    int columnIndex12 = Z.getColumnIndex("origin");
                    int columnIndex13 = Z.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (!(columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1)) {
                        HashSet hashSet3 = new HashSet();
                        while (Z.moveToNext()) {
                            if ("c".equals(Z.getString(columnIndex12))) {
                                iR5 c = c(iuj, Z.getString(columnIndex11), Z.getInt(columnIndex13) == 1);
                                if (c != null) {
                                    hashSet3.add(c);
                                }
                            }
                        }
                        Z.close();
                        hashSet2 = hashSet3;
                        return new imc(str, hashMap, hashSet, hashSet2);
                    }
                    return new imc(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static iR5 c(iUj iuj, String str, boolean z) {
        Cursor Z = iuj.Z("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = Z.getColumnIndex("seqno");
            int columnIndex2 = Z.getColumnIndex("cid");
            int columnIndex3 = Z.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                TreeMap treeMap = new TreeMap();
                while (Z.moveToNext()) {
                    if (Z.getInt(columnIndex2) >= 0) {
                        int i = Z.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), Z.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new iR5(str, z, arrayList);
            }
            return null;
        } finally {
            Z.close();
        }
    }

    public static ArrayList v(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new paX(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || imc.class != obj.getClass()) {
            return false;
        }
        imc imc = (imc) obj;
        String str = this.R;
        if (str == null ? imc.R != null : !str.equals(imc.R)) {
            return false;
        }
        Map map = this.f4723R;
        if (map == null ? imc.f4723R != null : !map.equals(imc.f4723R)) {
            return false;
        }
        Set set2 = this.f4724R;
        if (set2 == null ? imc.f4724R != null : !set2.equals(imc.f4724R)) {
            return false;
        }
        Set set3 = this.v;
        if (set3 == null || (set = imc.v) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        String str = this.R;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f4723R;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f4724R;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("TableInfo{name='");
        U.append(this.R);
        U.append('\'');
        U.append(", columns=");
        U.append(this.f4723R);
        U.append(", foreignKeys=");
        U.append(this.f4724R);
        U.append(", indices=");
        U.append(this.v);
        U.append('}');
        return U.toString();
    }
}
