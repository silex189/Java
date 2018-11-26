package amazonviewer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static amazonviewer.db.DataBase.*;

import amazonviewer.db.IDBConnection;
import amazonviewer.model.Movie;

public interface MovieDAO extends IDBConnection {

	default Movie setMovieViewed(Movie movie) {
		try (Connection connection = connectToDB()) {
			Statement statement = connection.createStatement();
			String query = "INSERT INTO " + TVIEWED + " (" + TVIEWED_IDMATERIAL + ", " + TVIEWED_IDELEMENT + ", "
					+ TVIEWED_IDUSUARIO + ")" + " VALUES(" + ID_TMATERIALS[0] + ", " + movie.getId() + ", " + TUSER_IDUSUARIO
					+ ")";
			if (statement.executeUpdate(query) > 0) {
				System.out.println("Marked as viewed");
			}

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return movie;
	}

	default ArrayList<Movie> read() {
		ArrayList<Movie> movies = new ArrayList();
		try (Connection connection = connectToDB()) {
			String query = "SELECT * FROM " + TMOVIE;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Movie movie = new Movie(resultSet.getString(TMOVIE_TITLE), resultSet.getString(TMOVIE_GENRE),
						resultSet.getString(TMOVIE_CREATOR), Integer.valueOf(resultSet.getString(TMOVIE_DURATION)),
						Short.valueOf(resultSet.getString(TMOVIE_YEAR)));

				movie.setId(Integer.valueOf(resultSet.getString(TMOVIE_ID)));
				movie.setViewed(getMovieViewed(preparedStatement, connection, Integer.valueOf(resultSet.getString(TMOVIE_ID))));
				movies.add(movie);

			}

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return movies;
	}

	default boolean getMovieViewed(PreparedStatement preparedStatement, Connection connection, int id_movie) {
		boolean viewed = false;
		String query = "SELECT * FROM " + TVIEWED + " WHERE " + TVIEWED_IDMATERIAL + "= ?" + " AND " + TVIEWED_IDELEMENT
				+ "= ?" + " AND " + TVIEWED_IDUSUARIO + "= ?";
		ResultSet resultSet = null;

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, ID_TMATERIALS[0]);
			preparedStatement.setInt(2, id_movie);
			preparedStatement.setInt(3, TUSER_IDUSUARIO);

			resultSet = preparedStatement.executeQuery();
			viewed = resultSet.next();

		} catch (Exception sqlException) {
			sqlException.printStackTrace();
		}

		return viewed;
	}

}
