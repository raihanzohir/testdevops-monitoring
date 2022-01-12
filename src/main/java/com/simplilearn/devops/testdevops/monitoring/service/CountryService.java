package com.simplilearn.devops.testdevops.monitoring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.simplilearn.devops.testdevops.monitoring.models.Country;
import com.simplilearn.devops.testdevops.monitoring.repositories.CountryRepository;


@Service
public class CountryService {
	
	private CountryRepository countryRepository;

	public CountryService(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}
	
	public List<Country> findAllCountries() {
		return countryRepository.findAll();
	}
	
	public Optional<Country> findCountryById(int id) {
		return countryRepository.findById(id);
	}
	
	public Optional<Country> findCountryByName(String name) {
		return countryRepository.findByName(name);
	}
	
	public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}
	
	public Country updateCountry(Country country) {
		Country updatedCountry = null;
		Optional<Country> countryOptional = countryRepository.findById(country.getId());
		if(countryOptional != null) {
			updatedCountry = countryRepository.save(country);
		}
		return updatedCountry;
	}
	
	public void deleteCountryById(int id) {
		countryRepository.deleteById(id);
	}

}
