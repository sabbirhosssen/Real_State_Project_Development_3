import React from "react";
import { Outlet } from "react-router-dom";
import Footer from "../layouts/Footer";
import Navbar from "../layouts/Header/Navbar";

const HomeRoute = () => {
  return (
    <div>
      <Navbar />
      <Outlet />
      <Footer />
    </div>
  );
};

export default HomeRoute;
