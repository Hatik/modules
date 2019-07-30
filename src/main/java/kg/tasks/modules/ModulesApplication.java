package kg.tasks.modules;

import kg.tasks.modules.configs.Config;
import kg.tasks.modules.helpers.ParameterStringBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ModulesApplication {

	static String bishkekCode = "222844";
	public static void main(String[] args) {
		SpringApplication.run(ModulesApplication.class, args);

		// send request to get data, parse object to the necessary object
	}






}
