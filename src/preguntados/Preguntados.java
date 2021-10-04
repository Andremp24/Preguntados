package preguntados;

public class Preguntados {

    public String[][] condicion = new String[5][5];

    public void Preguntas() {
    }

    public void nivelRandom() {

        condicion[0][0] = "¿Cual es el pais mas grande del mundo?\n"
                + " 1: China \n 2: Usa \n 3: Rusia \n 4: India";
        condicion[0][1] = "¿En que año se descubrio amarica ?\n"
                + " 1: 1492 \n 2: 1576 \n 3: 1345 \n 4: 1892";
        condicion[0][2] = "¿En que año se fundaron los beatles ?\n"
                + " 1:1952 \n 2: 1947 \n 3: 1989\n 4: 1956";
        condicion[0][3] = "¿Cual ha sido la pelicula mas taquillera de la historia?\n"
                + " 1: Avenger : end game \n 2: Avatar \n 3: Titanic \n 4: Star Wars";
        condicion[0][4] = "¿Halle x de la siguiente ecuacion : (5x-7 = -2(3-8x)+1) ?\n"
                + " 1: 1/1 \n 2: -2/11 \n 3: 9 \n 4: 2/11";
    }

    public void nivelCultura() {

        condicion[1][0] = "¿Cual es la capital de España?\n"
                + " 1: Estocolmo \n 2: Moscu \n 3: Barcelona \n 4: Madrid";
        condicion[1][1] = "¿Que idioma hablan en Australia  ?\n"
                + " 1: Español \n 2: Italiano \n 3: Ingles \n 4: Frances";
        condicion[1][2] = "¿de que color son la mayoria de pasaportes del mundo ?\n"
                + " 1:Morado \n 2: Negros \n 3: Azules \n 4: Rojos";
        condicion[1][3] = "¿Como se llama un grupo de peses?\n"
                + " 1: Cardumen \n 2: Grupo \n 3: Manada \n 4: Bandad";
        condicion[1][4] = "¿Cual es la enfermada que mas gente a matado en la historia ?\n"
                + " 1: VIH \n 2: Viruela \n 3: Covid-19 \n 4: Peste Negra";

    }

    public void nivelArte() {

        condicion[2][0] = "¿Cual es la pintura mas famosa de Da vinci?\n"
                + " 1: La mona lisa  \n 2: La ultima cena \n 3: Salvator mundi \n 4: Vitruvan Man";
        condicion[2][1] = "¿Quien pinto la ultima cena ?\n"
                + " 1: Miguel Angel \n 2: Da vinci  \n 3: Salvador dali \n 4: Picasso";
        condicion[2][2] = "¿Que se conoce como el septimo arte  ?\n"
                + " 1:Pinturas \n 2: Musica \n 3: cine \n 4: teatro";
        condicion[2][3] = "¿Cuales osn las flores mas intadas por Van Gogh?\n"
                + " 1: \" Margaritas \n 2: Rosas \n 3: Girasoles \n 4: Loto";
        condicion[2][4] = "¿En que siglo empezo el renacenismo ?\n"
                + " 1: Siglo XIV \n 2:Siglo XIX \n 3: SigloAC \n 4: Siglo X";
    }

    public void nivelAnimales() {

        condicion[3][0] = "¿Cual es el mas grande del mundo?\n"
                + " 1: Serpiente  \n 2: Elefante \n 3: Rinoceronte \n 4: Ballena";
        condicion[3][1] = "¿Cual es el mamifero mas rapido  ?\n"
                + " 1: leon \n 2: Jaguar \n 3: Tigre\n 4: Guepardo";
        condicion[3][2] = "¿Cual es el animal mas lento del mundo?\n"
                + " 1:Tortuga \n 2:El perezoso de tres dedos \n 3: Caracol \n 4: Hipopotamo";
        condicion[3][3] = "¿De que color es la piel del oso polar?\n"
                + " 1: Blanco \n 2:Rosa  \n 3: Cafe \n 4: Negro";
        condicion[3][4] = "¿De Donde son originarias las pirañas?\n"
                + " 1:  Rio Misipi \n 2: Rio amazonas \n 3: Rio Negro \n 4: Rio Grande";
    }

    public void nivelDeportes() {

        condicion[4][0] = "¿Cuanto dura cada set en un partido de voleibol?\n"
                + " 1: 25 \n 2: 9 \n 3: 8 \n 4: 35";
        condicion[4][1] = "¿Que deporte practica Tiger Woods ?\n"
                + " 1: Golf \n 2: Futbol \n 3: Tennis \n 4: Natacion";
        condicion[4][2] = "¿Cuantos arbitros hay en un partido de baloncesto ?\n"
                + " 1:3 \n 2: 1 \n 3: 6 \n 4: 2";
        condicion[4][3] = "¿Cuantas bases tienen la cancha de beisbol ?\n"
                + " 1: 2 \n 2: 6 \n 3: 9 \n 4: 7";
        condicion[4][4] = "¿Cual es el futbolista que tiene mas titulos?\n"
                + " 1: Messi \n 2: Cristiano \n 3: Dani Alvez \n 4: Ronaldo";
    }
}
