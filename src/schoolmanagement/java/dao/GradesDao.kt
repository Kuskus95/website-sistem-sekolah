package schoolmanagement.java.dao

import org.springframework.jdbc.core.JdbcTemplate
import schoolmanagement.java.models.Grades

class GradesDao {
    private var jdbcTemplate: JdbcTemplate? = null

    fun setJdbcTemplate(jdbcTemplate: JdbcTemplate?) {
        this.jdbcTemplate = jdbcTemplate
    }

    // Save a grade record
    fun saveGrade(grade: Grades): Boolean {
        val sql = "INSERT INTO grades (student_id, staff_id, subject, grade) VALUES (?, ?, ?, ?)"
        return jdbcTemplate!!.update(sql, grade.studentId, grade.teacherId, grade.courseName, grade.grade) > 0
    }

    // Get all grades for a student
    fun getGradesByStudent(studentId: String): List<Grades> {
        val sql = "SELECT * FROM grades WHERE student_id = ?"
        return jdbcTemplate!!.query(sql, arrayOf(studentId)) { rs, _ ->
            Grades().apply {
                id = rs.getString("id")
                this.studentId = rs.getString("student_id")
                teacherId = rs.getString("staff_id")
                courseName = rs.getString("subject")
                grade = rs.getString("grade")
            }
        }
    }

    // Get all grades (for admin/teacher overview)
    fun getAllGrades(): List<Grades> {
        val sql = "SELECT * FROM grades"
        return jdbcTemplate!!.query(sql) { rs, _ ->
            Grades().apply {
                id = rs.getString("id")
                studentId = rs.getString("student_id")
                teacherId = rs.getString("staff_id")
                courseName = rs.getString("subject")
                grade = rs.getString("grade")
            }
        }
    }

    // Optional: delete grade by id
    fun deleteGrade(id: String): Int {
        val sql = "DELETE FROM grades WHERE id = ?"
        return jdbcTemplate!!.update(sql, id)
    }
}
