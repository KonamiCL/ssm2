package main.java.cap.mapper

import cap.model.UcommentWithBLOBs

interface UcommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ucomment
     *
     * @mbg.generated
     */
    fun insert(record: UcommentWithBLOBs): Int

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ucomment
     *
     * @mbg.generated
     */
    fun insertSelective(record: UcommentWithBLOBs): Int
}