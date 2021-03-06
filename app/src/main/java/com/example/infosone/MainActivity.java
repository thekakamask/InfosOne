package com.example.infosone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements InterIntent  {

    private RecyclerView recyclerView;
    private static final int GAME_ACTIVITY_REQUEST_CODE=42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<Article> mesArticles = new ArrayList<>();

        mesArticles.add(new Article(R.drawable.tete,"L'Annulation du trou de la Sécu reportée à 2033","REUTERS","Le gouvernement français a présenté mardi deux projets de loi sur la Sécurité sociale, l’un organisant un transfert de dette sociale qui reporte à 2033 le remboursement du “trou de la Sécu”, l’autre amorçant la création d’une nouvelle branche consacrée à la prise en charge des personnes âgées dépendantes. Le déficit des comptes de la Sécurité sociale, dont la réduction avait déjà marqué le pas en 2019 du fait des mesures prises en réponse à la crise des Gilets jaunes, va se creuser fortement cette année en raison de l’impact de la pandémie de coronavirus. Le gouvernement projette de transférer 136 milliards d’euros de dette de la Sécurité sociale à la Caisse d’amortissement de la dette sociale (Cades), l’organisme qui “éponge” les dettes de la Sécurité sociale en les apurant sur une durée limitée pour éviter qu’elles ne pèsent sur les générations futures. La Cades, dont la durée de vie a été prolongée à deux reprises depuis sa création en 1996, était jusqu’ici supposée ramener la dette sociale à zéro en 2024 mais cet objectif a désormais été repoussé “à 2033”, est-il précisé dans un communiqué commun des ministères de la Santé, de l’Economie et des Finances, et des Comptes publics. Bercy avait déjà prévenu le mois dernier que le déficit de la Sécu devrait atteindre 41 milliards d’euros cette année, contre un déficit de 5,4 milliards anticipé dans la loi de financement de la Sécurité sociale voté en décembre dernier. Pour faire face à cette explosion des déficits, le gouvernement a relevé de 70 à 95 milliards d’euros le plafond d’emprunt de l’Agence centrale des organismes de sécurité sociale. Le gouvernement a également lancé les travaux en vue de la création d’une nouvelle branche de sécurité sociale relative à la prise en charge de la dépendance. ", "Reuters Staff", "22/05/2020"));
        mesArticles.add(new Article(R.drawable.altice,"L'Europe boursière relève la tête grâce à Wall Street","REUTERS","Les Bourses européennes ont fini en hausse mercredi, portées par la progression de Wall Street, les investisseurs privilégiant une nouvelle fois l’espoir d’une reprise économique malgré les risques persistants liés à l’épidémie de nouveau coronavirus. Les investisseurs suivront la publication à 18h00 GMT du compte-rendu de la dernière réunion de la Réserve fédérale (Fed). En tête du Stoxx 600, Marks & Spencer a bondi de 10,77% à la Bourse de Londres, le distributeur britannique ayant déclaré qu’il comptait accélérer sa restructuration pour faire face aux retombées du coronavirus ainsi qu’à la baisse de 21% de son bénéfice annuel. A WALL STREET Au moment de la clôture en Europe, le Dow Jones gagnait 1,77% et le Standard & Poor’s 500, plus large, progressait de 1,94%, se rapprochant des 3.000 points (à 2.979,6). Le Nasdaq Composite prenait de son côté 2,18%, évoluant à un plus haut niveau depuis trois mois. Le secteur technologique était bien entouré, dopé par les progressions de Facebook (+6%) et Amazon (+1,37%), qui se traitent à des niveaux record, tandis qu’Apple gagnait 2%. LES INDICATEURS DU JOUR Malgré l’optimisme ambiant sur les marchés, les indicateurs économiques du jour restent préoccupants: l’inflation britannique a reculé à 0,8% en rythme annuel en avril, un plus bas niveau depuis août 2016, renforçant le scénario d’un soutien accru de la Banque d’Angleterre (BoE) le mois prochain. Son gouverneur, Andrew Bailey, n’a pas écarté mercredi l’option de taux d’intérêt négatifs et a dit étudier attentivement les enseignements à tirer de son adoption par d’autres banques centrales. En zone euro, le chiffre définitif de l’inflation a été revu à la baisse, à 0,3% sur un an en avril, là encore au plus bas depuis août 2016, avec la chute des prix de l’énergie CHANGES L’euro (+0,57%) grimpe pour une quatrième journée consécutive face au dollar, soutenu par la proposition de la France et de l’Allemagne d’un plan européen de relance. Il a atteint un pic d’environ trois semaines à 1,0999. La livre se stabilise face au dollar après avoir baissé dans un premier temps en réaction au ralentissement de l’inflation britannique, qui alimente les spéculations selon laquelle la Banque d’Angleterre pourrait avoir recours à des taux d’intérêt négatifs. Face à un panier de devises internationales, le dollar perd 0,3%. TAUX Les rendements obligataires sont quasiment inchangés: celui des Treasuries à dix ans évolue autour de 0,711% et son équivalent allemand a terminé la journée à -0,468%. PÉTROLE Les cours du brut grimpent à la faveur des signes d’amélioration de la demande et d’une baisse surprise des stocks américains de pétrole brut la semaine dernière, selon l’Agence américaine d’information sur l’énergie (EIA). Les stocks de brut ont reculé d’environ 5 millions de barils au cours de la semaine au 15 mai alors que les économistes attendaient en moyenne une augmentation de 1,15 million de barils. Le brut léger américain (West Texas Intermediate, WTI) avance de 3,72% à 33,15 dollars le baril, après un pic de deux mois à 33,74. Le Brent de mer du Nord gagne 2,97% à 35,68 dollars après avoir atteint 36,46 dollars, là aussi un plus haut depuis la mi-mars.","Leatitia Volga", "22/05/2020"));
        mesArticles.add(new Article(R.drawable.keynes,"Altice Europe: Résultats légèrement sous le consensus au 1er trimestre, objectifs confirmés","REUTERS","Altice Europe a annoncé mercredi des résultats légèrement inférieurs aux attentes au premier trimestre mais a confirmé ses objectifs annuels en dépit de la pandémie de coronavirus. Le chiffre d’affaires de l’opérateur télécoms a progressé de 3,6% à 3,63 milliards d’euros au cours des trois premiers mois de l’année (+3,1% à changes constants) - conforme aux attentes - tandis que son principal résultat opérationnel (Ebitda) ajusté progressait de 1% à 1,31 milliard (+0,7% à changes constants), un chiffre légèrement inférieur au consensus fourni par la société (1,33 milliard). “Dans l’ensemble, nous avons connu un bon début 2020 et nous entendons continuer sur cette lancée pendant le reste de l’année”, a déclaré le fondateur du groupe, Patrick Drahi. Le groupe a confirmé viser une croissance de son chiffre d’affaires et de son Ebitda sur l’ensemble de l’exercice 2020 et prévoir une réduction de son endettement net, qui s’est établi à 31,2 milliards à fin mars.  En France, principal marché d’Altice Europe avec 70% du chiffre d’affaires l’an dernier, les ventes ont progressé à la fois pour les activités “professionnels” et grand public, tandis que les activités médias ont souffert des conséquences de la pandémie sur les revenus publicitaires, qui se sont effondrés. Le groupe a annoncé mardi un vaste plan de réorganisation et d’économies du pôle NextRadio TV, qui va se traduire notamment par la fermeture de la chaîne RMC Sport News et par des suppressions de postes.","Reuters Staff", "22/05/2020"));
        mesArticles.add(new Article(R.drawable.tata,"EDF: La justice valide la suspension du contrat d'Arenh de Total","REUTERS", "Le tribunal de commerce de Paris a ordonné mercredi à EDF de ne plus s’opposer à la suspension d’une partie des engagements d’achat d’électricité pris par Total dans le cadre de l’accès régulé à l’électricité nucléaire historique (Arenh), en jugeant que la clause de force majeure peut être valablement invoquée dans le contexte du coronavirus. Le tribunal de commerce de Paris a ordonné mercredi à EDF de ne plus s'opposer à la suspension d'une partie des engagements d'achat d'électricité pris par Total dans le cadre de l'accès régulé à l'électricité nucléaire historique (Arenh), en jugeant que la clause de force majeure peut être valablement invoquée dans le contexte du coronavirus. Dans son ordonnance de référé, dont Reuters a obtenu une copie, le président du tribunal considère que les conditions de la force majeure, telle que définie dans l’accord-cadre liant les parties, “sont manifestement réunies”. Il condamne également EDF à verser 50.000 euros à Total Direct Energie. EDF a annoncé son intention de faire appel afin d’obtenir un jugement au fond tandis que Total a fait savoir qu’il prenait acte de la décision du tribunal et qu’il ne ferait pas d’autre commentaire sur “cette affaire commerciale”.  Sa filiale Total Direct Energie et d’autres fournisseurs alternatifs d’électricité cherchaient depuis mi-mars à obtenir la suspension d’une partie au moins de leurs contrats d’Arenh en faisant valoir que, sous l’effet du coronavirus et des mesures de confinement, ils disposaient d’un surplus d’électricité qu’ils devaient écouler sur le marché à un prix bien inférieur à celui auquel ils l’avaient acheté. Réclamant l’activation d’une clause de force majeure qui leur permettrait de mettre fin aux livraisons des volumes d’Arenh et de s’approvisionner sur le marché à un prix beaucoup plus bas, ils s’étaient vu opposer une fin de non-recevoir par l’électricien public, ainsi que par la Commission de régulation de l’énergie (CRE) et le Conseil d’Etat. Le président du tribunal de commerce observe quant à lui dans sa décision que “la diffusion du virus revêt, à l’évidence, un caractère extérieur aux parties, qu’elle est irrésistible et qu’elle était imprévisible comme en témoigne la soudaineté et l’ampleur de son apparition”. Il relève également que Total Direct Energie est “confrontée à une baisse brutale et imprévisible de la consommation”, ce qui conduit la société “à céder des quantités qu’elle est dans l’obligation d’acheter auprès d’EDF à un prix très sensiblement inférieur à son coût d’acquisition”, la CRE constatant un prix de 21 euros par mégawatt-heure (MWh) contre un coût d’achat de 42 euros par MWh. Il en résulte donc pour la filiale de Total “des pertes importantes immédiates et définitives sur une durée dont elle n’a pas la maîtrise”. Le tribunal a en outre jugé recevable l’intervention de l’AFIEG (Association française indépendante de l’électricité et du gaz), qui s’était associée à la procédure de Total pour défendre les intérêts de ses membres - parmi lesquels Gazprom Energy, Alpiq, BKW, Enel, E.ON et Vattenfall. Gazel Energie, ex-filiale de l’allemand Uniper désormais détenue par la holding EPH, propriété du milliardaire tchèque Daniel Kretinsky, a elle aussi engagé une procédure devant le tribunal de commerce de Paris, pour laquelle une décision doit intervenir fin mai.","Reuters Staff", "22/05/2020"));
        mesArticles.add(new Article(R.drawable.edf,"Air France arrête l'exploitation de l'A380 avec le coronavirus","REUTERS", "Air France-KLM a annoncé mercredi, en raison de la pandémie de coronavirus, l’arrêt définitif de l’exploitation des A380 par Air France, initialement prévu fin 2022, ce qui se traduira par un impact de 500 millions d’euros dans ses comptes du deuxième trimestre lié à la dépréciation de sa flotte de très gros porteurs d’Airbus.nFace à la crise de la COVID-19 et compte tenu de son impact sur les niveaux d’activité prévus, le groupe Air France-KLM annonce aujourd’hui l’arrêt définitif de l’exploitation des Airbus A380 d’Air France”, déclare le groupe dans un communiqué, en soulignant que cela répond aussi à la volonté de simplification de sa flotte et de réduction de ses émissions polluantes. Air France est propriétaire de cinq A380 et en loue quatre autres. Les Airbus A380 seront remplacés par des appareils de nouvelle génération, comme l’Airbus A350 et le Boeing 787, dont les livraisons sont en cours , ajoute Air France-KLM.","Reuters Staff", "22/05/2020"));
        mesArticles.add(new Article(R.drawable.tete,"Le président de Deutsche Bank renonce à un 3e mandat","REUTERS", "Le président du conseil de surveillance de Deutsche Bank, Paul Achleitner, a annoncé mercredi son intention de quitter ses fonctions en 2022, renonçant à solliciter un troisième mandat de cinq ans alors que la première banque allemande est en pleine restructuration. Il a profité de l’assemblée générale annuelle des actionnaires du groupe pour officialiser sa décision en déclarant : “Je ne solliciterai pas une réélection. Après dix ans à ce poste, cela suffira.” Paul Achleitner, ancien associé de Goldman Sachs et ex-directeur financier de l’assureur Allianz, a été ces dernières années critiqués par des actionnaires qui lui reprochaient pêle-mêle les revirements stratégiques de la banque, les bouleversements au sein de l’équipe dirigeante et la chute de 80% en dix ans du cours de Bourse. Après cinq ans de pertes, Deutsche Bank est actuellement engagée dans une restructuration majeure qui prévoit la réduction de ses activités de banque d’investissement et la suppression de 18.000 postes dans le monde. La société de conseil aux investisseurs Glass Lewis avait recommandé aux actionnaires de voter contre le quitus au président du conseil lors de l’AG. Le président du directoire, Christian Sewing, a réfuté lors des débats l’idée que Deutsche Bank pourrait avoir besoin d’une aide publique pour survivre à la crise du coronavirus et il a estimé que le groupe devait améliorer sa rentabilité avant de pouvoir prétendre jouer un rôle dans la consolidation du secteur en Europe.", "Reuters Staff", "22/05/2020"));
        mesArticles.add(new Article(R.drawable.altice,"La logique de la fusion FCA-PSA plus forte que jamais, déclare Elkann","REUTERS", "La logique qui sous-tend le projet de fusion entre Fiat Chrysler Automobiles (FCA) et PSA est plus forte que jamais, a déclaré mercredi John Elkann, le président du constructeur italo-américain, alors que la pandémie de nouveau coronavirus a aggravé les difficultés du secteur automobile. S’exprimant lors de l’assemblée générale des actionnaires d’Exor, la holding de la famille Agnelli, John Elkann, petit-fils de Gianni Agnelli et PDG de la société, a affirmé que les travaux préparatoires à cette fusion entre égaux se déroulaient dans les temps et comme prévu. La logique stratégique de cette association des deux entreprises et de tous leurs employés est plus forte que jamais, a dit John Elkann, qui devrait prendre la présidence du futur groupe fusionné. FCA est critiqué en Italie en raison du dividende extraordinaire de 5,5 milliards d’euros qu’il est censé verser à ses actionnaires dans le cadre de sa fusion avec PSA, alors qu’il négocie dans le même temps avec le gouvernement italien un prêt de 6,3 milliards d’euros garanti par l’Etat face à la crise liée au coronavirus. Ce dividende, qui doit être distribué par la holding Fiat Chrysler Automobiles NV aux Pays-Bas, est un élément central de la valorisation de l’opération avec PSA et certains analystes pensent qu’une modification des modalités financières de l’accord pourrait entraîner l’échec de la fusion. Le sous-secrétaire italien au Trésor Pier Paolo Baretta a déclaré mercredi à Reuters que Rome envisageait de prolonger l’interdiction du versement d’un dividende pour les entreprises bénéficiant des garanties de l’Etat. Cette interdiction, pour l’instant en vigueur jusqu’à fin 2020, pourrait s’appliquer aux 12 mois suivant l’obtention de la garantie de l’Etat, a-t-il dit. FCA a refusé de s’exprimer sur ce point. Un tel allongement compliquerait la tâche du groupe alors que le versement du dividende exceptionnel doit intervenir juste avant la finalisation de la fusion avec PSA, prévue au premier trimestre 2021.", "Reuters Staff", "22/05/2020"));

        Adapter adapter = new Adapter(mesArticles, this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();





    }


    @Override
    public void gotoSecondActivity(Article mArticle) {

        //Intent intent = new Intent(this, MainActivity2.class);
        //intent.putExtra ("Article", mArticle);
        //startActivity(intent);


        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        //startActivityForResult(mainActivity2, GAME_ACTIVITY_REQUEST_CODE);
        intent.putExtra("Article selection", mArticle);
        startActivity(intent);
    }

   /* @Override
    public void gotoShare(Article mArticle) {
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.putExtra("Article selection", mArticle);
        startActivity(Intent.createChooser(myIntent, "share using"));

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.share_menu) {
            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            myIntent.putExtra(Intent.EXTRA_TEXT, "we are sharing ");
            startActivity(Intent.createChooser(myIntent, "share using"));
        }else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}