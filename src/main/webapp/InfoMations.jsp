<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<div id="InfoMations-router">    
<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <router-link to="/InfoMations/DepartManage" class="nav-link"> 系部管理 
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/ClassManage" class="nav-link"> 教师管理
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/ProManage" class="nav-link"> 专业管理
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/ExeClassManage" class="nav-link"> 行政班管理 
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/StuManage" class="nav-link"> 学生管理
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/CourseManage" class="nav-link"> 课程管理 
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/SemesterManage" class="nav-link"> 学年学期管理 
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/StcManage" class="nav-link"> 开课管理 
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/PacManage" class="nav-link"> 选课管理
	  </router-link>
    </li>
    <li class="nav-item">
      <router-link to="/InfoMations/ClassesManage" class="nav-link"> 教学班管理 
	  </router-link>
    </li>

    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Dropdown link
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Link 1</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>
  </ul>
</nav>
	<!-- router-view是组件显示的地方 -->
	<router-view></router-view>
</div>