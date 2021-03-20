package xyz.mxue.configuration.microprofile.config.source;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author mxuexxmy
 */
public class ConfigSources implements Iterable<ConfigSource>{

    @Override
    public Iterator<ConfigSource> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super ConfigSource> action) {

    }

    @Override
    public Spliterator<ConfigSource> spliterator() {
        return null;
    }
}
