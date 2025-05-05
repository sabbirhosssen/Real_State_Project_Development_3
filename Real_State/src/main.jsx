import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import "./index.css";
import Aboutus from "./pages/Aboutus";
import Blogs from "./pages/Blogs";
import Contacts from "./pages/Contacts";
import Home from "./pages/Home";
import Services from "./pages/Services";
import HomeRoute from "./routes/HomeRoute";

const router = createBrowserRouter([
  {
    path: "/",
    element: <HomeRoute />,
    children: [
      {
        index: true,
        element: <Home />,
      },
      {
        path: "about",
        element: <Aboutus />,
      },
      {
        path: "service",
        element: <Services />,
      },
      {
        path: "contact",
        element: <Contacts />,
      },
      {
        path: "blog",
        element: <Blogs />,
      },
    ],
  },
]);

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <RouterProvider router={router} />
  </StrictMode>
);
