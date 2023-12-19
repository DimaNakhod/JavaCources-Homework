package hillel.constants;

public class Constants {
    public static final String INSERT = "INSERT INTO actors (`name`, `surname`, `birthday`) VALUES (?, ?, ?);";
    public static final String SELECT_ACTORS_FROM_FILM = "SELECT * FROM actors JOIN films_id_actors_id ON actors.id = films_id_actors_id.actor_id JOIN films ON films_id_actors_id.film_id = films.id WHERE films.name LIKE ?;";
    public static final String SELECT_FILMS_FOR_CURRENT_AND_PREV_YEARS = "SELECT films.id, films.name, films.date_of_production, films.country, directors.id, directors.name, directors.surname, directors.birthday FROM videolibrary.films JOIN directors ON films.director_id = directors.id WHERE date_of_production BETWEEN '2019-01-01' AND '2020-12-31';";
    public static final String SELECT_ACTORS_BY_COUNT = "SELECT * FROM actors JOIN films_id_actors_id ON actors.id = films_id_actors_id.actor_id JOIN films ON films_id_actors_id.film_id = films.id GROUP BY films_id_actors_id.actor_id HAVING COUNT(actor_id) > ?;";
    public static final String SELECT_ACTORS_AS_DIRECTOR = "SELECT actors.id, actors.name, actors.surname, actors.birthday FROM actors JOIN directors ON actors.name = directors.name AND actors.surname = directors.surname AND actors.birthday = directors.birthday;";
    public static final String DELETE_FILMS_MORE_THAN_YEARS = "DELETE FROM films WHERE year(now()) - year(date_of_production) > ?;";
    public static final String FIND_ACTORS_FOR_FILM_WITH_ID = "SELECT actors.id, actors.name, actors.surname, actors.birthday FROM actors, films, films_id_actors_id WHERE films_id_actors_id.actor_id = actors.id AND films_id_actors_id.film_id = films.id AND films.id = ?;";
    public static final String SELECT_USERS = "SELECT * FROM users;";
}
