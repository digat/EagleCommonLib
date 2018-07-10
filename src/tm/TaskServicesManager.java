/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Tareq
 */
public class TaskServicesManager {
    private final Map<String, ServiceTask> services;
    private final ExecutorService executor = Executors.newCachedThreadPool();

    public TaskServicesManager() {
        services = Maps.newHashMap();
    }
    public void addService(String key, ServiceTask serviceTask){
        services.put(key, serviceTask);
    }
    public void runTask(final String key){
        final ServiceTask serviceTask = services.get(key);
        if(serviceTask!=null){
            CompletableFuture.supplyAsync(()->{
                serviceTask.execute();
                System.err.println("service "+key+" executed");
                return true;
            }, executor);  
        }
    }
    public ServiceTask getServiceTask(String key){
        return services.get(key);
    }
}
