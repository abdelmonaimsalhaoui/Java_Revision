package examples;

import java.util.Locale;

public class LocaleDetails {

	public static void main(String[] args) {

		Locale.setDefault(new Locale("ar","MA",""));
		Locale defaultLocale = Locale.getDefault();
		System.out.printf("The default locale is %s %n", defaultLocale);
		System.out.printf("The default language code is %s and the name is %s %n", defaultLocale.getLanguage(),
				defaultLocale.getDisplayLanguage());
		System.out.printf("The default country code is %s and the name is %s %n", defaultLocale.getCountry(),
				defaultLocale.getDisplayCountry());
		System.out.printf("The default variant code is %s and the name is %s %n", defaultLocale.getVariant(),
				defaultLocale.getDisplayVariant());

	}

}
