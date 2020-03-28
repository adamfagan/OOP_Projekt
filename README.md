# OOP_Projekt
Projekt z OPP (Trh)
Prvy Commit: - Agregácia - Predavajuci "má" Produkt
                         - Kupujuci "má" Produkt a Platbu
             - Dedenie   - PredavajuciEuropan a PredavajuciAmerican dedia od Predavajuci
                         - KupujuciEuropan a KupujuciAmerican dedia od Kupujuci
                         - Oblecenie a Topanky dedia od abstraktnej triedy Produkt
                         - KreditnaKarta, PayPal, Bitcoin dedia od abstraktnej triedy Platba
         - Polymorfizmus - V triede Trh volám v metóde "obchod1na1" metódu "kupuj", ktorá prislúcha 
                           parametru "kupujuci", v ktorom môžem mať pomocou polymorfizmu rôzne triedy, 
                           ktoré dedia od triedy Kupujuci. Takže môže túto metódu vyvolať KupujuciEuropan,
                           KupujuciAmerican ale aj Kupujuci.
                         - Použitý návrhový vzor Visitor - Pridávanie operácií k objektom určitých tried bez
                           toho, aby ich bolo potrebné meniť - Pridávam operácie k objektu Kupujuci, bez toho
                           aby som ho menil. Pri vytvorení novej triedy odvodenej od triedy Platba, tak nemusím
                           meniť triedu Kupujuci a všetky triedy, ktoré sú od Kupujuceho odvodené. Ak vytvorím
                           novú triedu odvodenú od triedy Kupujuci, tak túto novú triedu nemusím meniť (resp.
                           jej metódu v ktorej používam návrhový vzor Visitor), ale musím pridať novú metódu
                           (preťažiť) do všetkých tried odvodených od triedy Platba, s parametrom tejto novej
                           triedy odvodenej od Kupujuceho. (Visitor = Platba, Element = Kupujuci). Polymorfizmus
                           je v tomto vzore použitý, tak že objekt odvodený od abstraktnej triedy volá nad
                           sebou metódu do ktorej ako parameter vkladá samého seba a následne v tomto odvodenom
                           objekte sa vykoná tá preťažená metóda, ktorá prislúcha tomu typu objektu, ktorý je 
                           ako parameter - Polymorfizmus = používam rôzne triedy odvodené od abstraktnej triedy
                   - GUI - Používateľ dokáže v tejto verzii projektu zadávať počet Kupujucich, 
                           počet Kupujucich Europanov a počet Kupujucich Americanov. Následne dokáže pomocou 
                           tlačidla vytvoriť účastníkov trhu - ku celkovému počtu Kupujucih sa vytvorí taký istý
                           počet predávajúcich. Ďalej používateľ dokáže pomocou tlačidla spustiť trh čím sa do
                           GUI vypíšu údaje o obchode medzi Predavajucim a Kupujucim.
                             
