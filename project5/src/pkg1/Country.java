 package pkg1;

public class Country {

	private String countryName;
	private String countryCode;
	private String countryCapitol;
	private double countryPopulation;
	private double countryGDP;
	private double countryHappy;

	public Country(String name, String code, String capitol, double population, double gdp, double happy) {
		this.countryName = name;
		this.countryCode = code;
		this.countryCapitol = capitol;
		this.countryPopulation = population;
		this.countryGDP = gdp;
		this.countryHappy = happy;
	}

	public String getcountryName() {
		return countryName;
	}

	public void setCountryName(String s) {
		countryName = s;
	}

	public String getcountryCode() {
		return countryCode;
	}

	public void setCountryCode(String s) {
		countryCode = s;
	}

	public String getcountryCapitol() {
		return countryCapitol;
	}

	public void setCountryCapitol(String s) {
		countryCapitol = s;
	}

	public double getcountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(double s) {
		countryPopulation = s;
	}

	public double getcountryGDP() {
		return countryGDP;
	}

	public void setCountryGDP(double s) {
		countryGDP = s;
	}

	public double getcountryHappy() {
		return countryHappy;
	}

	public void setCountryHappy(double s) {
		countryHappy = s;
	}

	public int compare(Country c) {
		return countryName.compareTo(c.getcountryName());
	}

	public void printCountry() {
		System.out.printf("%nName: \t %s%n", countryName);
		System.out.printf("Country Code: \t %s%n", countryCode);
		System.out.printf("Capital City: \t %s%n", countryCapitol);
		System.out.printf("Population: \t %f%n", countryPopulation);
		System.out.printf("GDP: \t %f%n", countryGDP);
		System.out.printf("Happiness: \t %f%n", countryHappy);

	}

}