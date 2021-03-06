package dev.ebullient.micrometer.deployment;

import org.jboss.jandex.ClassInfo;

import io.quarkus.builder.item.MultiBuildItem;

final class MicrometerRegistryProviderBuildItem extends MultiBuildItem {

    final Class<?> providedRegistryClass;

    public MicrometerRegistryProviderBuildItem(ClassInfo provider) {
        this.providedRegistryClass = null;
    }

    public MicrometerRegistryProviderBuildItem(Class<?> providedRegistryClass) {
        this.providedRegistryClass = providedRegistryClass;
    }

    public Class<?> getProvidedRegistryClass() {
        return providedRegistryClass;
    }

    @Override
    public String toString() {
        return "MicrometerRegistryProviderBuildItem{"
                + providedRegistryClass.getName()
                + '}';
    }
}
