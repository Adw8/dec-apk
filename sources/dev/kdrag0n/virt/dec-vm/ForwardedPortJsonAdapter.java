package dev.kdrag0n.virt.vm;

public final class ForwardedPortJsonAdapter extends JsonAdapter<ForwardedPort> {
    // Field names for the JSON object
    public final JsonReader.Options fieldNames = JsonReader.Options.of("containerId", "containerPort", "hostPort", "listenOnAll");

    // JSON adapter for containerId field
    public final JsonAdapter<String> containerIdAdapter;

    // JSON adapter for containerPort and hostPort fields
    public final JsonAdapter<Integer> portAdapter;

    // JSON adapter for listenOnAll field
    public final JsonAdapter<Boolean> listenOnAllAdapter;

    public ForwardedPortJsonAdapter(JsonAdapter.Factory factory) {
        // Initialize JSON adapters for each field
        this.containerIdAdapter = factory.create(String.class);
        this.portAdapter = factory.create(int.class);
        this.listenOnAllAdapter = factory.create(boolean.class);
    }

    @Override
    public void toJson(JsonWriter writer, ForwardedPort value) throws IOException {
        if (value != null) {
            writer.beginObject();
            writer.name("containerId");
            containerIdAdapter.toJson(writer, value.containerId);
            writer.name("containerPort");
            portAdapter.toJson(writer, value.containerPort);
            writer.name("hostPort");
            portAdapter.toJson(writer, value.hostPort);
            writer.name("listenOnAll");
            listenOnAllAdapter.toJson(writer, value.listenOnAll);
            writer.endObject();
        } else {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
    }

    @Override
    public ForwardedPort fromJson(JsonReader reader) throws IOException {
        String containerId = null;
        Integer containerPort = null;
        Integer hostPort = null;
        Boolean listenOnAll = null;

        reader.beginObject();
        while (reader.hasNext()) {
            int index = reader.selectName(fieldNames);
            switch (index) {
                case 0:
                    containerId = containerIdAdapter.fromJson(reader);
                    if (containerId == null) {
                        throw JsonDataException.H("containerId", "containerId", reader);
                    }
                    break;
                case 1:
                case 2:
                    int portValue = portAdapter.fromJson(reader);
                    if (index == 1) {
                        containerPort = portValue;
                    } else {
                        hostPort = portValue;
                    }
                    break;
                case 3:
                    listenOnAll = listenOnAllAdapter.fromJson(reader);
                    if (listenOnAll == null) {
                        throw JsonDataException.H("listenOnAll", "listenOnAll", reader);
                    }
                    break;
                default:
                    reader.skipName();
                    reader.skipValue();
            }
        }
        reader.endObject();

        // Check for null or missing fields
        if (containerId == null) {
            throw JsonDataException.M("containerId", "containerId", reader);
        } else if (containerPort != null) {
            if (hostPort != null) {
                if (listenOnAll != null) {
                    return new ForwardedPort(containerId, containerPort, hostPort, listenOnAll);
                } else {
                    throw JsonDataException.M("listenOnAll", "listenOnAll", reader);
                }
            } else {
                throw JsonDataException.M("hostPort", "hostPort", reader);
            }
        } else {
            throw JsonDataException.M("containerPort", "containerPort", reader);
        }
    }

    @Override
    public String toString() {
        return "GeneratedJsonAdapter(ForwardedPort)";
    }
}
