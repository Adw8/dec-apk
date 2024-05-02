package defpackage;

import java.io.File;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.ApiStatus;

/* renamed from: n7K  reason: default package */
/* loaded from: classes.dex */
public class n7K {
    public static final lXr DEFAULT_DIAGNOSTIC_LEVEL = lXr.DEBUG;
    private boolean attachThreads;
    private nQx beforeBreadcrumb;
    private hMk beforeSend;
    private String cacheDirPath;
    private boolean debug;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableExternalConfiguration;
    private boolean enableScopeSync;
    private String environment;
    private final List<lxb> eventProcessors;
    private coB executorService;
    private HostnameVerifier hostnameVerifier;
    private final List<fwF> integrations;
    private Double profilesSampleRate;
    private b4U profilesSampler;
    private String proguardUuid;
    private lTN proxy;
    private String release;
    private Double sampleRate;
    private aGW sdkVersion;
    private String sentryClientName;
    private String serverName;
    private SSLSocketFactory sslSocketFactory;
    private Double tracesSampleRate;
    private cLX tracesSampler;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private boolean enableNdk = true;
    private g79 logger = dq.Z;
    private lXr diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
    private fix envelopeReader = new nyp(new oCJ(this));
    private b9x serializer = new oCJ(this);
    private int maxDepth = 100;
    private int maxCacheItems = 30;
    private int maxQueueSize = 30;
    private int maxBreadcrumbs = 100;
    private final List<String> inAppExcludes = new CopyOnWriteArrayList();
    private final List<String> inAppIncludes = new CopyOnWriteArrayList();
    private ce7 transportFactory = ppN.m;
    private iET transportGate = dq.x;
    private boolean attachStacktrace = true;
    private boolean enableAutoSessionTracking = true;
    private long sessionTrackingIntervalMillis = 30000;
    private boolean attachServerName = true;
    private boolean enableUncaughtExceptionHandler = true;
    private boolean printUncaughtStackTrace = false;
    private int connectionTimeoutMillis = 5000;
    private int readTimeoutMillis = 5000;
    private kuy envelopeDiskCache = aFJ.R;
    private boolean sendDefaultPii = false;
    private final List<dVQ> observers = new ArrayList();
    private final Map<String, String> tags = new ConcurrentHashMap();
    private long maxAttachmentSize = 20971520;
    private boolean enableDeduplication = true;
    private int maxSpans = 1000;
    private boolean enableShutdownHook = true;
    private dqy maxRequestBodySize = dqy.NONE;
    private boolean traceSampling = true;
    private long maxTraceFileSize = 5242880;
    private cHc transactionProfiler = hw1.x;
    private List<String> tracePropagationTargets = null;
    private final List<String> defaultTracePropagationTargets = Collections.singletonList(".*");
    private Long idleTimeout = 3000L;
    private final List<String> contextTags = new CopyOnWriteArrayList();
    private boolean sendClientReports = true;
    public cFS clientReportRecorder = new hw1(this);

    public n7K(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.executorService = hw1.m;
        if (!z) {
            this.executorService = new aXE(5, 0);
            copyOnWriteArrayList2.add(new fT_());
            copyOnWriteArrayList2.add(new o1F(0));
            copyOnWriteArrayList.add(new nsr(this));
            copyOnWriteArrayList.add(new ppN(this));
            if (!dqB.R) {
                copyOnWriteArrayList.add(new kyW());
            }
            setSentryClientName("sentry.java/6.6.0");
            aGW agw = new aGW("sentry.java", "6.6.0");
            agw.R("maven:io.sentry:sentry");
            setSdkVersion(agw);
        }
    }

    public static n7K empty() {
        return new n7K(true);
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(lxb lxb) {
        this.eventProcessors.add(lxb);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(fwF fwf) {
        this.integrations.add(fwf);
    }

    public void addScopeObserver(dVQ dvq) {
        this.observers.add(dvq);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (!str.isEmpty()) {
            this.tracePropagationTargets.add(str);
        }
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public nQx getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public hMk getBeforeSend() {
        return this.beforeSend;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @ApiStatus.Internal
    public cFS getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public lXr getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    @ApiStatus.Internal
    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public kuy getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public fix getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public List<lxb> getEventProcessors() {
        return this.eventProcessors;
    }

    @ApiStatus.Internal
    public coB getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public List<fwF> getIntegrations() {
        return this.integrations;
    }

    public g79 getLogger() {
        return this.logger;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public dqy getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    @ApiStatus.Experimental
    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public b4U getProfilesSampler() {
        return this.profilesSampler;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public lTN getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<dVQ> getScopeObservers() {
        return this.observers;
    }

    public aGW getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public b9x getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @ApiStatus.ScheduledForRemoval
    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public cLX getTracesSampler() {
        return this.tracesSampler;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    public cHc getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public ce7 getTransportFactory() {
        return this.transportFactory;
    }

    public iET getTransportGate() {
        return this.transportGate;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        return (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) || getProfilesSampler() != null;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    @ApiStatus.Experimental
    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void merge(c9a c9a) {
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        c9a.getClass();
        for (Map.Entry entry : new HashMap((Map) null).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        c9a.getClass();
        Iterator it = new ArrayList((Collection) null).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        c9a.getClass();
        Iterator it2 = new ArrayList((Collection) null).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        c9a.getClass();
        Iterator it3 = new HashSet((Collection) null).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        c9a.getClass();
        c9a.getClass();
        Iterator it4 = new ArrayList((Collection) null).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        c9a.getClass();
        c9a.getClass();
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBeforeBreadcrumb(nQx nqx) {
        this.beforeBreadcrumb = nqx;
    }

    public void setBeforeSend(hMk hmk) {
        this.beforeSend = hmk;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDiagnosticLevel(lXr lxr) {
        if (lxr == null) {
            lxr = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = lxr;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    @ApiStatus.Internal
    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        g79 g79 = this.logger;
        Charset charset = mvm.R;
        String str2 = null;
        if (str != null && !str.isEmpty()) {
            try {
                str2 = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(mvm.R))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                g79.L(lXr.INFO, "SHA-1 isn't available to calculate the hash.", e);
            } catch (Throwable th) {
                g79.x(lXr.INFO, "string: %s could not calculate its hash", th, str);
            }
        }
        this.dsnHash = str2;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnvelopeDiskCache(kuy kuy) {
        if (kuy == null) {
            kuy = aFJ.R;
        }
        this.envelopeDiskCache = kuy;
    }

    public void setEnvelopeReader(fix fix) {
        if (fix == null) {
            fix = ppN.L;
        }
        this.envelopeReader = fix;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    @ApiStatus.Internal
    public void setExecutorService(coB cob) {
        if (cob != null) {
            this.executorService = cob;
        }
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setLogger(g79 g79) {
        this.logger = g79 == null ? dq.Z : new ars(this, g79);
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(dqy dqy) {
        this.maxRequestBodySize = dqy;
    }

    @ApiStatus.Experimental
    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfilesSampleRate(Double d) {
        if (mLz.x(d, true)) {
            this.profilesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(b4U b4u) {
        this.profilesSampler = b4u;
    }

    @Deprecated
    public void setProfilingEnabled(boolean z) {
        if (getProfilesSampleRate() == null) {
            setProfilesSampleRate(z ? Double.valueOf(1.0d) : null);
        }
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(lTN ltn) {
        this.proxy = ltn;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d) {
        boolean z = true;
        if (d != null && (d.isNaN() || d.doubleValue() > 1.0d || d.doubleValue() <= 0.0d)) {
            z = false;
        }
        if (z) {
            this.sampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values > 0.0 and <= 1.0.");
    }

    @ApiStatus.Internal
    public void setSdkVersion(aGW agw) {
        this.sdkVersion = agw;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new hw1(this);
        } else {
            this.clientReportRecorder = new hw1();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(b9x b9x) {
        if (b9x == null) {
            b9x = ppN.Z;
        }
        this.serializer = b9x;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    @ApiStatus.ScheduledForRemoval
    @Deprecated
    public void setShutdownTimeout(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    @ApiStatus.Internal
    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = list;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (mLz.x(d, true)) {
            this.tracesSampleRate = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(cLX clx) {
        this.tracesSampler = clx;
    }

    @ApiStatus.Internal
    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    public void setTransactionProfiler(cHc chc) {
        if (chc == null) {
            chc = hw1.x;
        }
        this.transactionProfiler = chc;
    }

    public void setTransportFactory(ce7 ce7) {
        if (ce7 == null) {
            ce7 = ppN.m;
        }
        this.transportFactory = ce7;
    }

    public void setTransportGate(iET iet) {
        if (iet == null) {
            iet = dq.x;
        }
        this.transportGate = iet;
    }
}
