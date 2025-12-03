// src/api/userApi.js
import axios from "axios";

// 공통 axios 인스턴스 (선택사항, 있으면 편함)
const api = axios.create({
  baseURL: "/api/user",   // 백엔드 URL prefix
});

// 전체 유저 조회
export const getUsers = () => api.get("/list");

// 특정 유저 조회
export const getUserById = (id) => api.get(`/detail/${id}`);

// 회원 등록
export const createUser = (data) => api.post("/create", data);

// 회원 정보 수정
export const updateUser = (data) => api.put("/update", data);

// 회원 삭제
export const deleteUser = (id) => api.delete(`/delete/${id}`);

export default {
  getUsers,
  getUserById,
  createUser,
  updateUser,
  deleteUser,
};