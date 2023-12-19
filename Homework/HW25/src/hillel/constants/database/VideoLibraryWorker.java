package hillel.constants.database;

import hillel.constants.entity.Actor;
import hillel.constants.entity.Film;
import hillel.constants.entity.User;
import hillel.constants.utils.Handler;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static hillel.constants.Constants.*;

public class VideoLibraryWorker{
    public boolean addActor(Actor actor, Connection connection) {
        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setString(1, actor.getName());
            statement.setString(2, actor.getSurname());
            Date date = new Date(actor.getBirthday().getTime());
            statement.setDate(3, date);
            int updatedCount = statement.executeUpdate();
            return updatedCount > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Film> findFilmsForCurrentAndPreviousYear(Connection connection) {
        List<Film> result = new ArrayList<>();
        try(PreparedStatement statement = connection.prepareStatement(SELECT_FILMS_FOR_CURRENT_AND_PREV_YEARS)) {
            result = Handler.handleFilms(statement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Actor> findActorsForFilm(String filmName, Connection connection) {
        ArrayList<Actor> result = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(SELECT_ACTORS_FROM_FILM)) {
            statement.setString(1, filmName);
            result = Handler.handleActors(statement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public List<Actor> findActorsForFilm(int filmsCount, Connection connection) {
        ArrayList<Actor> result = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(SELECT_ACTORS_BY_COUNT)) {
            statement.setInt(1, filmsCount);
            result = Handler.handleActors(statement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public List<Actor> findActorAsDirector(Connection connection) {
        List<Actor> result = new ArrayList<>();
        try(PreparedStatement statement = connection.prepareStatement(SELECT_ACTORS_AS_DIRECTOR)) {
            result = Handler.handleActors(statement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void deleteFilmsOlderGivenYears(int years, Connection connection) {
        try(PreparedStatement statement = connection.prepareStatement(DELETE_FILMS_MORE_THAN_YEARS)) {
            statement.setInt(1, years);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getUsers(Connection connection) {
        List<User> result = new ArrayList<>();
        try(PreparedStatement statement = connection.prepareStatement(SELECT_USERS)) {
            result = Handler.handleUsers(statement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Actor> getActorsForFilmWithId(int filmId, Connection connection) {
        List<Actor> result = new ArrayList<>();
        try(PreparedStatement statement = connection.prepareStatement(FIND_ACTORS_FOR_FILM_WITH_ID)) {
            statement.setInt(1, filmId);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                Date birthday = new Date(rs.getDate("birthday").getTime());
                Actor actor = new Actor(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), birthday);
                result.add(actor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
