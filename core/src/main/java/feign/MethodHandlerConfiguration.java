/*
 * Copyright 2012-2023 The Feign Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package feign;
public class MethodHandlerConfiguration {

    private feign.MethodMetadata metadata;

    private feign.Target<?> target;

    private feign.Retryer retryer;

    private java.util.List<feign.RequestInterceptor> requestInterceptors;

    private feign.Logger logger;

    private feign.Logger.Level logLevel;

    private feign.RequestTemplate.Factory buildTemplateFromArgs;

    private feign.Request.Options options;

    private feign.ExceptionPropagationPolicy propagationPolicy;

    public feign.MethodMetadata getMetadata() {
        return metadata;
    }

    public feign.Target getTarget() {
        return target;
    }

    public feign.Retryer getRetryer() {
        return retryer;
    }

    public java.util.List getRequestInterceptors() {
        return requestInterceptors;
    }

    public feign.Logger getLogger() {
        return logger;
    }

    public feign.Logger.Level getLogLevel() {
        return logLevel;
    }

    public feign.RequestTemplate.Factory getBuildTemplateFromArgs() {
        return buildTemplateFromArgs;
    }

    public feign.Request.Options getOptions() {
        return options;
    }

    public feign.ExceptionPropagationPolicy getPropagationPolicy() {
        return propagationPolicy;
    }

    public void setMetadata(feign.MethodMetadata metadata) {
        this.metadata=metadata;
    }

    public void setTarget(feign.Target target) {
        this.target=target;
    }

    public void setRetryer(feign.Retryer retryer) {
        this.retryer=retryer;
    }

    public void setRequestInterceptors(java.util.List requestInterceptors) {
        this.requestInterceptors=requestInterceptors;
    }

    public void setLogger(feign.Logger logger) {
        this.logger=logger;
    }

    public void setLogLevel(feign.Logger.Level logLevel) {
        this.logLevel=logLevel;
    }

    public void setBuildTemplateFromArgs(feign.RequestTemplate.Factory buildTemplateFromArgs) {
        this.buildTemplateFromArgs=buildTemplateFromArgs;
    }

    public void setOptions(feign.Request.Options options) {
        this.options=options;
    }

    public void setPropagationPolicy(feign.ExceptionPropagationPolicy propagationPolicy) {
        this.propagationPolicy=propagationPolicy;
    }

    public MethodHandlerConfiguration    (feign.MethodMetadata metadata,feign.Target target,feign.Retryer retryer,java.util.List requestInterceptors,feign.Logger logger,feign.Logger.Level logLevel,feign.RequestTemplate.Factory buildTemplateFromArgs,feign.Request.Options options,feign.ExceptionPropagationPolicy propagationPolicy){
        this.metadata    =    metadata;
        this.target    =    target;
        this.retryer    =    retryer;
        this.requestInterceptors    =    requestInterceptors;
        this.logger    =    logger;
        this.logLevel    =    logLevel;
        this.buildTemplateFromArgs    =    buildTemplateFromArgs;
        this.options    =    options;
        this.propagationPolicy    =    propagationPolicy;
}
}
