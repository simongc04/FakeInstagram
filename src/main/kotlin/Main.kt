import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun InterfazPrincipal() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFEFEF))
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "FakeInstagram",
                fontSize = 30.sp,
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            Divider(color = Color.Gray, thickness = 1.dp)

            Row(modifier = Modifier.fillMaxSize().padding(10.dp)) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(250.dp)
                        .padding(end = 8.dp)
                ) {
                    ListaHistorias()
                    Spacer(modifier = Modifier.height(16.dp))
                    ListaSugerencias()
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 8.dp)
                ) {
                    ListaPublicaciones()
                }
            }
        }
    }
}

@Composable
fun ListaHistorias() {
    Text(
        text = "Historias",
        fontSize = 16.sp,
        modifier = Modifier.padding(bottom = 8.dp)
    )
    Column(modifier = Modifier.fillMaxWidth()) {
        historias.forEach { historia ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                Image(
                    painter = painterResource(historia.imagen),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = historia.nombre,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Composable
fun ListaSugerencias() {
    Text(
        text = "Sugerencias",
        fontSize = 16.sp,
        modifier = Modifier.padding(bottom = 8.dp)
    )
    Column(modifier = Modifier.fillMaxWidth()) {
        sugerencias.forEach { sugerencia ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                Image(
                    painter = painterResource(sugerencia.imagen),
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = sugerencia.nombre,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Composable
fun ListaPublicaciones() {
    Text(
        text = "Publicaciones",
        fontSize = 18.sp,
        fontWeight = MaterialTheme.typography.body1.fontWeight,
        modifier = Modifier.padding(bottom = 8.dp)
    )
    publicaciones.forEach { publicacion ->
        TarjetaPublicacion(publicacion)
    }
}

@Composable
fun TarjetaPublicacion(publicacion: Publicacion) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        backgroundColor = Color.White,
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(publicacion.imagenPerfil),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = publicacion.autor,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Image(
                painter = painterResource(publicacion.imagenContenido),
                contentDescription = null,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .height(180.dp)
            )
            Text(
                text = publicacion.texto,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 6.dp)
            )
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Red Social",
        state = rememberWindowState(width = 1280.dp, height = 800.dp)
    ) {
        InterfazPrincipal()
    }
}
