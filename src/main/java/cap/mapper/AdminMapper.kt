package main.java.cap.mapper

import cap.model.Admin

interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    fun deleteByPrimaryKey(id: Int?): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    fun insert(record: Admin): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    fun insertSelective(record: Admin): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    fun selectByPrimaryKey(id: Int?): Admin

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    fun updateByPrimaryKeySelective(record: Admin): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated
     */
    fun updateByPrimaryKey(record: Admin): Int
}