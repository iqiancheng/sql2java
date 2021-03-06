package net.sourceforge.sql2java.lib;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Data access manager.
 */
public interface DaoManager<T> {
    public T createBean();
    public String getTableName();
    public T loadByPrimaryKey(Integer id) throws SQLException;
    public int deleteByPrimaryKey(Integer id) throws SQLException;
    public List<T> loadAll() throws SQLException;
    public List<T> loadAll(int startRow, int numRows) throws SQLException;
    public List<T> loadByWhere(String where) throws SQLException;
    public List<T> loadByWhere(String where, Object... fields) throws SQLException;
    public List<T> loadByWhere(String where, int startRow, int numRows) throws SQLException;
    public T loadUniqueByWhere(String where) throws SQLException;
    public T loadUniqueByWhere(String where, Object... fields) throws SQLException;
    public int deleteAll() throws SQLException;
    public int deleteByWhere(String where) throws SQLException;
    public int deleteByWhere(String where, Object... fields) throws SQLException;
    public T save(T bean) throws SQLException;
    public T insert(T bean) throws SQLException;
    public T insert(T bean, boolean orUpdate) throws SQLException;
    public T insert(T bean, boolean orUpdate, boolean delayed) throws SQLException;
    public T update(T bean) throws SQLException;
    public List<T> save(List<T> beans) throws SQLException;
    public List<T> insert(List<T> beans) throws SQLException;
    public List<T> update(List<T> beans) throws SQLException;
    public T loadUniqueUsingTemplate(T bean) throws SQLException;
    public List<T> loadUsingTemplate(T bean) throws SQLException;
    public List<T> loadUsingTemplate(T bean, int startRow, int numRows) throws SQLException;
    public List<T> loadUsingTemplate(T bean, int startRow, int numRows, int searchType) throws SQLException;
    public int deleteUsingTemplate(T bean) throws SQLException;
    public int countAll() throws SQLException;
    public int countWhere(String where) throws SQLException;
    public int countWhere(String where, Object... fields) throws SQLException;
    public int countUsingTemplate(T bean) throws SQLException;
    public int countUsingTemplate(T bean, int startRow, int numRows) throws SQLException;
    public int countUsingTemplate(T bean, int startRow, int numRows, int searchType) throws SQLException;
    public List<T> decodeResultSet(ResultSet rs, int startRow, int numRows) throws SQLException;
    public T decodeRow(ResultSet rs) throws SQLException;
    public T metaDataDecodeRow(ResultSet rs) throws SQLException;
    public List<T> loadByPreparedStatement(PreparedStatement ps) throws SQLException;
    public List<T> loadByPreparedStatement(PreparedStatement ps, int startRow, int numRows) throws SQLException;
}
