package org.camunda.vercors;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;
import org.camunda.vercors.message.SendMessageWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZeebeClient
public class VercorsApplication {
    private final Logger logger = LoggerFactory.getLogger(VercorsApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(VercorsApplication.class, args);

    }
    // https://docs.camunda.io/docs/components/best-practices/development/writing-good-workers/

}
