package org.agriko.farmos.cn.template.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="template-v1", path="/template/v1")
public interface TemplateApi { }
