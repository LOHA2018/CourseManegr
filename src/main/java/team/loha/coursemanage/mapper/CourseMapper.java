package team.loha.coursemanage.mapper;

import org.springframework.stereotype.Repository;
import team.loha.coursemanage.entity.Course;

import java.util.List;

@Repository
public interface CourseMapper {
    public List<Course> getAllCourseByUserId(long id);
}
