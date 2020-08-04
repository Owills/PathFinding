    
public class MapFactory {
    //helper function to add connections between two cities
    private static void connect(City a, City b, int d){
        a.addConnection(b, d);
        b.addConnection(a, d);
    }
    
    //builds a node map of the USA
    //change the return statement at the very bottom to choose the starting city
    public static City buildMapFromNewYork(){
        City bangorME = new City("Bangor, ME");
        
        City portlandME = new City("Portland, ME");
        connect(portlandME, bangorME, 118);
        
        City portsmouthNH = new City("Portsmouth, NH");
        connect(portsmouthNH, portlandME, 55);
        
        City burlingtonVT = new City("Burlington, VT");
        connect(burlingtonVT, portsmouthNH, 190);
        connect(burlingtonVT, portlandME, 259);
        
        City bostonMA = new City("Boston, MA");
        connect(bostonMA, portsmouthNH, 60);
        
        City providenceRI = new City("Providence, RI");
        connect(providenceRI, bostonMA, 53);
        
        City worcesterMA = new City("Worcester, MA");
        connect(worcesterMA, bostonMA, 49);
        connect(worcesterMA, portsmouthNH, 83);
        connect(worcesterMA, providenceRI, 44);
        
        City albanyNY = new City("Albany, NY");
        connect(albanyNY, burlingtonVT, 177);
        connect(albanyNY, worcesterMA, 128);
        
        City newHavenCT = new City("New Haven, CT");
        connect(newHavenCT, worcesterMA, 97);
        connect(newHavenCT, providenceRI, 100);
        
        City newYorkNY = new City("New York, NY");
        connect(newYorkNY, newHavenCT, 79);
        connect(newYorkNY, albanyNY, 141);
        
        City buffaloNY = new City("Buffalo, NY");
        connect(buffaloNY, albanyNY, 266);
        
        City philadelphiaPA = new City("Philadelphia, PA");
        connect(philadelphiaPA, newYorkNY, 98);
        
        City washingtonDC = new City("Washington, DC");
        connect(washingtonDC, philadelphiaPA, 145);
        
        City pittsburghPA = new City("Pittsburgh, PA");
        connect(pittsburghPA, washingtonDC, 240);
        connect(pittsburghPA, philadelphiaPA, 288);
        connect(pittsburghPA, buffaloNY, 200);
        
        City clevelandOH = new City("Cleveland, OH");
        connect(clevelandOH, pittsburghPA, 133);
        connect(clevelandOH, buffaloNY, 183);
        
        City richmondVA = new City("Richmond, VA");
        connect(richmondVA, washingtonDC, 105);
        
        City charlestonWV = new City("Charleston, WV");
        connect(charlestonWV, pittsburghPA, 213);
        connect(charlestonWV, washingtonDC, 343);
        connect(charlestonWV, richmondVA, 297);
        
        City charlotteNC = new City("Charlotte, NC");
        connect(charlotteNC, richmondVA, 260);
        connect(charlotteNC, charlestonWV, 254);
        
        City atlantaGA = new City("Atlanta, GA");
        connect(atlantaGA, charlotteNC, 229);
        
        City jacksonvilleFL = new City("Jacksonville, FL");
        connect(jacksonvilleFL, atlantaGA, 300);
        connect(jacksonvilleFL, charlotteNC, 337);
        
        City miamiFL = new City("Miami, FL");
        connect(miamiFL, jacksonvilleFL, 308);
        
        City tampaFL = new City("Tampa, FL");
        connect(tampaFL, miamiFL, 251);
        connect(tampaFL, jacksonvilleFL, 187);
        
        City newOrleansLA = new City("New Orleans, LA");
        connect(newOrleansLA, jacksonvilleFL, 473);
        connect(newOrleansLA, tampaFL, 563);
        connect(newOrleansLA, atlantaGA, 410);
        
        City nashvilleTN = new City("Nashville, TN");
        connect(nashvilleTN, charlotteNC, 390);
        connect(nashvilleTN, atlantaGA, 226);
        connect(nashvilleTN, charlestonWV, 350);
        
        City memphisTN = new City("Memphis, TN");
        connect(memphisTN, nashvilleTN, 191);
        connect(memphisTN, newOrleansLA, 347);
        connect(memphisTN, atlantaGA, 346);
        
        City detroitMI = new City("Detroit, MI");
        connect(detroitMI, clevelandOH, 164);
        
        City indianapolisIN = new City("Indianapolis, IN");
        connect(indianapolisIN, nashvilleTN, 264);
        connect(indianapolisIN, pittsburghPA, 339);
        connect(indianapolisIN, clevelandOH, 294);
        connect(indianapolisIN, detroitMI, 265);
        connect(indianapolisIN, charlestonWV, 299);
        
        City chicagoIL = new City("Chicago, IL");
        connect(chicagoIL, detroitMI, 265);
        connect(chicagoIL, indianapolisIN, 177);
        
        City milwaukeeWI = new City("Milwaukee, WI");
        connect(milwaukeeWI, chicagoIL, 89);
        
        City minneapolisMN = new City("Minneapolis, MN");
        connect(minneapolisMN, milwaukeeWI, 300);
        
        City fargoND = new City("Fargo, ND");
        connect(fargoND, minneapolisMN, 213);
        
        City siouxFallsSD = new City("Sioux Falls, SD");
        connect(siouxFallsSD, fargoND, 214);
        connect(siouxFallsSD, minneapolisMN, 230);
        connect(siouxFallsSD, milwaukeeWI, 443);
        
        City omahaNE = new City("Omaha, NE");
        connect(omahaNE, siouxFallsSD, 164);
        
        City desMoinesIA = new City("Des Moines, IA");
        connect(desMoinesIA, omahaNE, 124);
        connect(desMoinesIA, chicagoIL, 306);
        connect(desMoinesIA, minneapolisMN, 221);
        
        City stLouisMO = new City("St. Louis, MO");
        connect(stLouisMO, chicagoIL, 286);
        connect(stLouisMO, indianapolisIN, 235);
        connect(stLouisMO, nashvilleTN, 281);
        connect(stLouisMO, memphisTN, 256);
        
        City kansasCityMO = new City("Kansas City, MO");
        connect(kansasCityMO, omahaNE, 168);
        connect(kansasCityMO, desMoinesIA, 176);
        connect(kansasCityMO, stLouisMO, 226);
        
        City oklahomaCityOK = new City("Oklahoma City, OK");
        connect(oklahomaCityOK, kansasCityMO, 312);
        connect(oklahomaCityOK, stLouisMO, 449);
        connect(oklahomaCityOK, memphisTN, 416);
        
        City dallasTX = new City("Dallas, TX");
        connect(dallasTX, oklahomaCityOK, 189);
        connect(dallasTX, memphisTN, 408);
        connect(dallasTX, newOrleansLA, 455);
        
        City houstonTX = new City("Houston, TX");
        connect(houstonTX, dallasTX, 214);
        connect(houstonTX, newOrleansLA, 313);
        
        City sanAntonioTX = new City("San Antonio, TX");
        connect(sanAntonioTX, dallasTX, 246);
        connect(sanAntonioTX, houstonTX, 182);
        
        City elPasoTX = new City("El Paso, TX");
        connect(elPasoTX, dallasTX, 552);
        connect(elPasoTX, sanAntonioTX, 473);
        
        City albuquerqueNM = new City("Albuquerque, NM");
        connect(albuquerqueNM, elPasoTX, 234);
        connect(albuquerqueNM, oklahomaCityOK, 482);
        
        City denverCO = new City("Denver, CO");
        connect(denverCO, albuquerqueNM, 392);
        connect(denverCO, kansasCityMO, 528);
        connect(denverCO, omahaNE, 466);
        
        City billingsMT = new City("Billings, MT");
        connect(billingsMT, denverCO, 485);
        connect(billingsMT, siouxFallsSD, 597);
        connect(billingsMT, fargoND, 529);
        
        City butteMT = new City("Butte, MT");
        connect(butteMT, billingsMT, 211);
        
        City saltLakeCityUT = new City("Salt Lake City, UT");
        connect(saltLakeCityUT, butteMT, 366);
        connect(saltLakeCityUT, denverCO, 480);
        
        City phoenixAZ = new City("Phoenix, AZ");
        connect(phoenixAZ, elPasoTX, 379);
        connect(phoenixAZ, albuquerqueNM, 397);
        
        City lasVegasNV = new City("Las Vegas, NV");
        connect(lasVegasNV, saltLakeCityUT, 369);
        connect(lasVegasNV, albuquerqueNM, 514);
        connect(lasVegasNV, phoenixAZ, 294);
        
        City losAngelesCA = new City("Los Angeles, CA");
        connect(losAngelesCA, lasVegasNV, 263);
        connect(losAngelesCA, phoenixAZ, 350);
        
        City sanDiegoCA = new City("San Diego, CA");
        connect(sanDiegoCA, losAngelesCA, 116);
        connect(sanDiegoCA, phoenixAZ, 335);
        connect(sanDiegoCA, lasVegasNV, 311);
        
        City montereyCA = new City("Monterey, CA");
        connect(montereyCA, losAngelesCA, 319);
        
        City sanFranciscoCA = new City("San Francisco, CA");
        connect(sanFranciscoCA, montereyCA, 114);
        connect(sanFranciscoCA, losAngelesCA, 358);
        
        City sacramentoCA = new City("Sacramento, CA");
        connect(sacramentoCA, sanFranciscoCA, 84);
        connect(sacramentoCA, saltLakeCityUT, 585);
        
        City boiseID = new City("Boise, ID");
        connect(boiseID, butteMT, 393);
        connect(boiseID, saltLakeCityUT, 301);
        
        City portlandOR = new City("Portland, OR");
        connect(portlandOR, sacramentoCA, 538);
        connect(portlandOR, boiseID, 407);
        
        City seattleWA = new City("Seattle, WA");
        connect(seattleWA, portlandOR, 175);
        connect(seattleWA, butteMT, 544);
        connect(seattleWA, boiseID, 472);
        
        //change this return city to start wherever you want
        return newYorkNY;
    }
    
    

}
