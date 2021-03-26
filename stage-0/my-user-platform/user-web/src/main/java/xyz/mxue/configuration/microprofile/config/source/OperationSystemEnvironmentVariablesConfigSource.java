package xyz.mxue.configuration.microprofile.config.source;

import java.util.Map;

/**
 * @author mxuexxmy
 */
public class OperationSystemEnvironmentVariablesConfigSource extends MapBasedConfigSource {

    public OperationSystemEnvironmentVariablesConfigSource() {
        super("Operation System Environment Variables", 300);
    }

    @Override
    public void prepareConfigData(Map configData){
        configData.putAll(System.getenv());
    }
}
