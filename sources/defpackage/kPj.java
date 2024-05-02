package defpackage;

import java.util.HashMap;

/* renamed from: kPj  reason: default package */
/* loaded from: classes.dex */
public abstract class kPj {
    public static final HashMap R;

    static {
        HashMap hashMap = new HashMap();
        R = hashMap;
        hashMap.put("%i", 536870934);
        hashMap.put("#2", 536871034);
        hashMap.put("#4", 536870933);
        hashMap.put("*7", 536871035);
        hashMap.put("k1", 131);
        hashMap.put("k2", 132);
        hashMap.put("k3", 133);
        hashMap.put("k4", 134);
        hashMap.put("k5", 135);
        hashMap.put("k6", 136);
        hashMap.put("k7", 137);
        hashMap.put("k8", 138);
        hashMap.put("k9", 139);
        hashMap.put("k;", 140);
        hashMap.put("F1", 141);
        hashMap.put("F2", 142);
        hashMap.put("F3", 536871043);
        hashMap.put("F4", 536871044);
        hashMap.put("F5", 536871045);
        hashMap.put("F6", 536871046);
        hashMap.put("F7", 536871047);
        hashMap.put("F8", 536871048);
        hashMap.put("F9", 536871049);
        hashMap.put("FA", 536871050);
        hashMap.put("FB", 536871051);
        hashMap.put("FC", 536871052);
        hashMap.put("FD", 536871053);
        hashMap.put("FE", 536871054);
        hashMap.put("kb", 67);
        hashMap.put("kd", 20);
        hashMap.put("kh", 122);
        hashMap.put("kl", 21);
        hashMap.put("kr", 22);
        hashMap.put("K1", 122);
        hashMap.put("K3", 92);
        hashMap.put("K4", 123);
        hashMap.put("K5", 93);
        hashMap.put("ku", 19);
        hashMap.put("kB", 536870973);
        hashMap.put("kD", 112);
        hashMap.put("kDN", 536870932);
        hashMap.put("kF", 536870932);
        hashMap.put("kI", 124);
        hashMap.put("kN", 92);
        hashMap.put("kP", 93);
        hashMap.put("kR", 536870931);
        hashMap.put("kUP", 536870931);
        hashMap.put("@7", 123);
        hashMap.put("@8", 160);
    }

    public static String R(int i, int i2, boolean z, boolean z2) {
        boolean z3 = (i2 & 268435456) != 0;
        int i3 = i2 & -268435457;
        String str = "\u001b";
        if (i != 4) {
            if (i == 61) {
                return (536870912 & i3) == 0 ? "\t" : "\u001b[Z";
            }
            if (i != 62) {
                if (i == 66) {
                    return (i3 & Integer.MIN_VALUE) == 0 ? "\r" : "\u001b\r";
                }
                if (i == 67) {
                    if ((i3 & Integer.MIN_VALUE) == 0) {
                        str = "";
                    }
                    StringBuilder U = opT.U(str);
                    U.append((i3 & 1073741824) == 0 ? "" : "\b");
                    return U.toString();
                } else if (i == 92) {
                    return v("\u001b[5", i3, '~');
                } else {
                    if (i == 93) {
                        return v("\u001b[6", i3, '~');
                    }
                    if (i != 111) {
                        if (i == 112) {
                            return v("\u001b[3", i3, '~');
                        }
                        switch (i) {
                            case 19:
                                return i3 == 0 ? z ? "\u001bOA" : "\u001b[A" : v("\u001b[1", i3, 'A');
                            case 20:
                                return i3 == 0 ? z ? "\u001bOB" : "\u001b[B" : v("\u001b[1", i3, 'B');
                            case 21:
                                return i3 == 0 ? z ? "\u001bOD" : "\u001b[D" : v("\u001b[1", i3, 'D');
                            case 22:
                                return i3 == 0 ? z ? "\u001bOC" : "\u001b[C" : v("\u001b[1", i3, 'C');
                            case 23:
                                return "\r";
                            default:
                                switch (i) {
                                    case 120:
                                        return "\u001b[32~";
                                    case 121:
                                        return "\u001b[34~";
                                    case 122:
                                        return i3 == 0 ? z ? "\u001bOH" : "\u001b[H" : v("\u001b[1", i3, 'H');
                                    case 123:
                                        return i3 == 0 ? z ? "\u001bOF" : "\u001b[F" : v("\u001b[1", i3, 'F');
                                    case 124:
                                        return v("\u001b[2", i3, '~');
                                    default:
                                        switch (i) {
                                            case 131:
                                                return i3 == 0 ? "\u001bOP" : v("\u001b[1", i3, 'P');
                                            case 132:
                                                return i3 == 0 ? "\u001bOQ" : v("\u001b[1", i3, 'Q');
                                            case 133:
                                                return i3 == 0 ? "\u001bOR" : v("\u001b[1", i3, 'R');
                                            case 134:
                                                return i3 == 0 ? "\u001bOS" : v("\u001b[1", i3, 'S');
                                            case 135:
                                                return v("\u001b[15", i3, '~');
                                            case 136:
                                                return v("\u001b[17", i3, '~');
                                            case 137:
                                                return v("\u001b[18", i3, '~');
                                            case 138:
                                                return v("\u001b[19", i3, '~');
                                            case 139:
                                                return v("\u001b[20", i3, '~');
                                            case 140:
                                                return v("\u001b[21", i3, '~');
                                            case 141:
                                                return v("\u001b[23", i3, '~');
                                            case 142:
                                                return v("\u001b[24", i3, '~');
                                            case 143:
                                                if (z2) {
                                                    return "\u001bOP";
                                                }
                                                return null;
                                            case 144:
                                                return z3 ? z2 ? v("\u001bO", i3, 'p') : "0" : v("\u001b[2", i3, '~');
                                            case 145:
                                                return z3 ? z2 ? v("\u001bO", i3, 'q') : "1" : i3 == 0 ? z ? "\u001bOF" : "\u001b[F" : v("\u001b[1", i3, 'F');
                                            case 146:
                                                return z3 ? z2 ? v("\u001bO", i3, 'r') : "2" : i3 == 0 ? z ? "\u001bOB" : "\u001b[B" : v("\u001b[1", i3, 'B');
                                            case 147:
                                                return z3 ? z2 ? v("\u001bO", i3, 's') : "3" : "\u001b[6~";
                                            case 148:
                                                return z3 ? z2 ? v("\u001bO", i3, 't') : "4" : i3 == 0 ? z ? "\u001bOD" : "\u001b[D" : v("\u001b[1", i3, 'D');
                                            case 149:
                                                return z2 ? v("\u001bO", i3, 'u') : "5";
                                            case 150:
                                                return z3 ? z2 ? v("\u001bO", i3, 'v') : "6" : i3 == 0 ? z ? "\u001bOC" : "\u001b[C" : v("\u001b[1", i3, 'C');
                                            case 151:
                                                return z3 ? z2 ? v("\u001bO", i3, 'w') : "7" : i3 == 0 ? z ? "\u001bOH" : "\u001b[H" : v("\u001b[1", i3, 'H');
                                            case 152:
                                                return z3 ? z2 ? v("\u001bO", i3, 'x') : "8" : i3 == 0 ? z ? "\u001bOA" : "\u001b[A" : v("\u001b[1", i3, 'A');
                                            case 153:
                                                return z3 ? z2 ? v("\u001bO", i3, 'y') : "9" : "\u001b[5~";
                                            case 154:
                                                return z2 ? v("\u001bO", i3, 'o') : "/";
                                            case 155:
                                                return z2 ? v("\u001bO", i3, 'j') : "*";
                                            case 156:
                                                return z2 ? v("\u001bO", i3, 'm') : "-";
                                            case 157:
                                                return z2 ? v("\u001bO", i3, 'k') : "+";
                                            case 158:
                                                return z3 ? z2 ? "\u001bOn" : "." : v("\u001b[3", i3, '~');
                                            case 159:
                                                return ",";
                                            case 160:
                                                return z2 ? v("\u001bO", i3, 'M') : "\n";
                                            case 161:
                                                return z2 ? v("\u001bO", i3, 'X') : "=";
                                            default:
                                                return null;
                                        }
                                }
                        }
                    }
                }
            } else if ((i3 & 1073741824) == 0) {
                return null;
            } else {
                return "\u0000";
            }
        }
        return str;
    }

    public static String v(String str, int i, char c) {
        int i2;
        if (i == Integer.MIN_VALUE) {
            i2 = 3;
        } else if (i == -1610612736) {
            i2 = 4;
        } else if (i == -1073741824) {
            i2 = 7;
        } else if (i == -536870912) {
            i2 = 8;
        } else if (i == 536870912) {
            i2 = 2;
        } else if (i == 1073741824) {
            i2 = 5;
        } else if (i != 1610612736) {
            return str + c;
        } else {
            i2 = 6;
        }
        return str + ";" + i2 + c;
    }
}
