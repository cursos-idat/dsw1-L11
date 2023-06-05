package edu.idat.dsw1.idatdsw1soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.consumingwebservice.wsdl.GetCountryResponse;

@SpringBootApplication
public class IdatDsw1SoapClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdatDsw1SoapClientApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(CountryClient quoteClient) {
		return args -> {
			String country = "Peru";

			if (args.length > 0) {
				country = args[0];
			}
			GetCountryResponse response = quoteClient.getCountry(country);
			System.err.println("=========================================");
			System.err.println("=========================================");
			System.err.println(response.getCountry().getCapital());
			System.err.println("=========================================");
			System.err.println("=========================================");
		};
	}

}
