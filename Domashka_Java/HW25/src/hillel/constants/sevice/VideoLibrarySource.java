package hillel.constants.sevice;

import hillel.constants.entity.Actor;
import hillel.constants.entity.Film;
import hillel.constants.entity.User;

import java.util.List;

public interface VideoLibrarySource {
    void addActor(Actor actor);

    List<Film> findFilmsForCurrentAndPreviousYear();

    List<Actor> findActorsForFilm(String filmName);

    List<Actor> findActorsForFilm(int filmsCount);

    List<Actor> findActorAsDirector();

    boolean deleteFilmsOlderGivenYears(int years);

    List<User> getUsers();

}
