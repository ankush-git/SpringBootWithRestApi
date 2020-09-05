package com.org.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringVersionController {

	// 1. By mapping different request url for each version
	@GetMapping("springVersionv1/urlMapping")
	public SpringV1 getSpringVersion1() {
		return new SpringV1("Spring");
	}

	@GetMapping("springVersionv2/urlMapping")
	public SpringV2 getSpringVersion2() {
		return new SpringV2("Spring","Boot 2.0.0");
	}

	// 2. By passing the version using Request parameter
	@GetMapping(value="springVersion/requestParam", params="version=v1")
	public SpringV1 getSpringVersionByReqParam1() {
		return new SpringV1("Spring");
	}

	@GetMapping(value="springVersion/requestParam", params="version=v2")
	public SpringV2 getSpringVersionByReqParam2() {
		return new SpringV2("Spring", "Boot 2.0.0");
	}

	// 3.By passing version in Header parameters
	@GetMapping(value="springVersion/requestHeader", headers="API_VERSION=v1")
	public SpringV1 getSpringVersionByReqHeader1() {
		return new SpringV1("Spring");
	}

	@GetMapping(value="springVersion/requestHeader", headers="API_VERSION=v2")
	public SpringV2 getSpringVersionByReqHeader2() {
		return new SpringV2("Spring", "Boot 2.0.0");
	}
	
	//4. By passing the version in the MIME type 
	@GetMapping(value="springVersion/mimeType", produces="application/vnd.company.app-v1+json")
	public SpringV1 getSpringVersionByMIMEType1() {
		return new SpringV1("Spring");
	}

	@GetMapping(value="springVersion/mimeType", produces="application/vnd.company.app-v2+json")
	public SpringV2 getSpringVersionByMIMEType2() {
		return new SpringV2("Spring", "Boot 2.0.0");
	}
	

}
