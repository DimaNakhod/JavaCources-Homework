package hillel.constants.sevice.impl;

import hillel.constants.database.VideoLibraryWorker;
import hillel.constants.entity.Actor;
import hillel.constants.entity.Film;
import hillel.constants.entity.User;
import hillel.constants.sevice.VideoLibrarySource;
import hillel.constants.utils.ConnectionPool;

import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VideoLibrary implements VideoLibrarySource {

    private VideoLibraryWorker source;
    private ConnectionPool connectionPool;

    public VideoLibrary() {
        this.source = new VideoLibraryWorker();
        this.connectionPool = new ConnectionPool();
    }

    @Override
    public void addActor(Actor actor) {
        try (Connection connection = connectionPool.getConnection()) {
            source.addActor(actor, connection);
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Film> findFilmsForCurrentAndPreviousYear() {
        List<Film> result = new ArrayList<>();
        try (Connection connection = connectionPool.getConnection()) {
            connection.setAutoCommit(false);
            result = source.findFilmsForCurrentAndPreviousYear(connection);
            for (Film film : result) {
                film.setActors(source.getActorsForFilmWithId(film.getId(), connection));
            }
            connection.commit();
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorsForFilm(String filmName) {
        List<Actor> result = new ArrayList<>();
        try (Connection connection = connectionPool.getConnection()) {
            result = source.findActorsForFilm(filmName, connection);
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorsForFilm(int filmsCount) {
        List<Actor> result = new ArrayList<>();
        try(Connection connection = connectionPool.getConnection()) {
            result = source.findActorsForFilm(filmsCount, connection);
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Actor> findActorAsDirector() {
        List<Actor> result = new ArrayList<>();
        try(Connection connection = connectionPool.getConnection()) {
            result = source.findActorAsDirector(connection);
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean deleteFilmsOlderGivenYears(int years) {
        boolean flag = false;
        try(Connection connection = connectionPool.getConnection()) {
            source.deleteFilmsOlderGivenYears(years, connection);
            flag = true;
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<User> getUsers() {
        List<User> result = new ArrayList<>();
        try(Connection connection = connectionPool.getConnection()) {
            result = source.getUsers(connection);
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public VideoLibraryWorker getSource() {
        return source;
    }

    public void setSource(VideoLibraryWorker source) {
        this.source = source;
    }

}
