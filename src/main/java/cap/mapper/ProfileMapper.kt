package main.java.cap.mapper

import cap.model.Profile
import sun.java2d.cmm.Profile

interface ProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    fun deleteByPrimaryKey(id: Int?): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    fun insert(record: Profile): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    fun insertSelective(record: Profile): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    fun selectByPrimaryKey(id: Int?): Profile

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    fun updateByPrimaryKeySelective(record: Profile): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbg.generated
     */
    fun updateByPrimaryKey(record: Profile): Int
} }