import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import MainPage from "./pages/MainPage";
import Login from "./pages/Login";
import SignupUser from "./pages/SignUpUser";
import SignupOwner from "./pages/SignUpOwner";
import GlampingList from "./pages/GlampingList";
import GlampingDetail from "./pages/GlampingDetail";
import Reservation from "./pages/Reservation";
import Payment from "./pages/Payment";
import MyPage from "./pages/Mypage";
import MyReview from "./pages/MyReview";
import MyFavorite from "./pages/MyFavorite";
import OwnerDashboard from "./pages/OwnerDashboard";



function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/login" element={<Login />} />
        <Route path="/signup/user" element={<SignupUser />} />
        <Route path="/signup/owner" element={<SignupOwner />} />

        <Route path="/glamping" element={<GlampingList />} />
        <Route path="/glamping/:id" element={<GlampingDetail />} />

        <Route path="/reservation" element={<Reservation />} />
        <Route path="/payment" element={<Payment />} />

        <Route path="/mypage" element={<MyPage />} />
        <Route path="/mypage/reviews" element={<MyReview />} />
        <Route path="/mypage/favorites" element={<MyFavorite />} />

        <Route path="/owner/dashboard" element={<OwnerDashboard />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
